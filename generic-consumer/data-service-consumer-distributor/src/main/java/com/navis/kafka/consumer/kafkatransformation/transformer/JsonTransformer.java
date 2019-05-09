package com.navis.kafka.consumer.kafkatransformation.transformer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.navis.kafka.consumer.kafkatransformation.bean.TransformedEvent;
import com.navis.kafka.consumer.kafkatransformation.config.N4Dependency;
import com.navis.kafka.consumer.util.DateUtil;
import com.navis.kafka.consumer.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.*;

@Component
public class JsonTransformer {

    @Autowired
    private N4Dependency n4Dependency;

    public TransformedEvent transform(String inJsonValue) {

        Map<String, Object> jsonObject = JsonUtil.fromJson(inJsonValue, new TypeReference<Map<String, Object>>() {
        });

        String topicName = (String) jsonObject.get("table");
        String operation = (String) jsonObject.get("operation");
        Long timestamp = (Long) jsonObject.get("timestamp");
        String clientId = "DPW_DPWR_RWG";//(String) jsonObject.get("clientid");

        Map<String, List<String>> pkFkMap = n4Dependency.getN4PkFkMapping(topicName);

        String alias = pkFkMap.get("table_alias").get(0);

        Map<String, Object> renamedJsonMap = renameJsonKeys(jsonObject, alias);
        addMultiTenantPksAndFks(renamedJsonMap, pkFkMap, clientId, alias);

        //add timestamp and operations
        renamedJsonMap.put(alias.trim() + "_operation", operation);
        renamedJsonMap.put(alias.trim() + "_timestamp", timestamp);

        String multitenantKey = renamedJsonMap.get(alias + "_multi_tenant_pk").toString();

        return TransformedEvent.builder().eventJson(JsonUtil.toJson(renamedJsonMap)).key(multitenantKey)
                .topicName(topicName).build();

    }


    private void addMultiTenantPksAndFks(Map<String, Object> inValue, Map<String, List<String>> inPkFkMap,
                                         String inClientId, String inTableAlias) {
        if (inValue == null) {
            return;
        }
        if (inPkFkMap.containsKey("foreign_key")) {
            List<String> fks = inPkFkMap.get("foreign_key");
            Map<String, Object> mtFksMap = addMultiTenantFks(inValue, fks, inClientId, inTableAlias);
            inValue.putAll(mtFksMap);
        }

        if (inPkFkMap.containsKey("primary_key")) {
            List<String> pks = inPkFkMap.get("primary_key");
            Map<String, Object> mtPksMap = addMultiTenantPk(inValue, pks, inClientId, inTableAlias);
            inValue.putAll(mtPksMap);
        }

    }


    private Map<String, Object> addMultiTenantFks(Map<String, Object> inValue, List<String> inFks,
                                                  String inClientId, String inTableAlias) {
        Map<String, Object> multiTenantFkMap = new HashMap<>();
        for (String fk : inFks) {
            String mtFkValue = null;
            Object fkValue = inValue.get(inTableAlias.trim() + "_" + fk.trim());
            if (fkValue != null) {
                StringBuilder builder = new StringBuilder();
                mtFkValue = builder.append(inClientId).append("_").append(fkValue).toString();
            }
            //replace null with
            if (mtFkValue == null) {
                mtFkValue = "0";
            }
            String mtFkKey = inTableAlias.trim() + "_" + fk.trim() + "_fk";
            multiTenantFkMap.put(mtFkKey, mtFkValue);
        }
        return multiTenantFkMap;
    }

    private Map<String, Object> addMultiTenantPk(Map<String, Object> inValue, List<String> inPks, String inClientId,
                                                 String inTableAlias) {
        Map<String, Object> multiTenantPkMap = new HashMap<>();
        StringBuilder valueBuilder = new StringBuilder();
        valueBuilder.append(inClientId);
        for (String pk : inPks) {
            valueBuilder.append("_").append(inValue.get(inTableAlias.trim() + "_" + pk.trim()));
        }
        multiTenantPkMap.put(inTableAlias + "_multi_tenant_pk", valueBuilder.toString());
        return multiTenantPkMap;
    }

    private Map<String, Object> renameJsonKeys(Map<String, Object> jsonObject, String inTableAlias) {
        Map<String, Object> data;
        String operation = (String) jsonObject.get("operation");
        if (!operation.equals("d")) {
            data = (Map<String, Object>) jsonObject.get("after");
            if (data == null) {
                System.out.println("error :: after object cannot be null for create, update and read event");
            }
        } else {
            data = (Map<String, Object>) jsonObject.get("before");
            if (data == null) {
                System.out.println("error :: after object cannot be null for delete event");
            }
        }
        if (data == null) {
            return null;
        }
        List<Map<String, Object>> valueList = (List<Map<String, Object>>) data.get("value");
        Map<String, Object> attributes = new LinkedHashMap<>();
        if (valueList != null && !valueList.isEmpty()) {
            valueList.stream()
                    .forEach(listElement -> {
                        String jsonType = (String) listElement.get("type");
                        Object value = listElement.get("value");
                        if (value != null) {
                            if (jsonType.equals("Timestamp")) {
                                if (value instanceof Integer) {
                                    Timestamp ts = new Timestamp(Long.valueOf((Integer) value));
                                    value = new Date(ts.getTime());
                                } else {
                                    Timestamp ts = new Timestamp((Long) value);
                                    value = new Date(ts.getTime());
                                }
                                value = DateUtil.convertDateToUtc((Date) value);
                            }
                        }
                        attributes.put(inTableAlias.trim() + "_" + ((String) listElement.get("key")).trim(), value);
                    });
        }
        return attributes;
    }
}
