package com.navis.kafka.consumer.kafkatransformation.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.navis.kafka.consumer.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@PropertySource("classpath:n4-dependency.properties")
public class N4Dependency {

    @Autowired
    private Environment env;

    private static Map<String, Map<String, List<String>>> n4PkFkMapping = new ConcurrentHashMap<>();

    public Map<String,List<String>> getN4PkFkMapping(String inTableName){

        if(n4PkFkMapping.containsKey(inTableName)){
            return n4PkFkMapping.get(inTableName);
        }

        String pkFkMapping = env.getProperty(inTableName);
        Map<String, Object> jsonObject = JsonUtil.fromJson(pkFkMapping, new TypeReference<Map<String, Object>>() {
        });
        List<String> pks = (List<String>)jsonObject.get("primary_key");
        List<String> fks = (List<String>)jsonObject.get("foreign_key");
        List<String> alias = new ArrayList<>(1);
        alias.add((String)jsonObject.get("table_alias"));

        Map<String,List<String>> pkFkMap = new HashMap<>();
        pkFkMap.put("primary_key",pks);
        if(fks != null && !fks.isEmpty()){
            pkFkMap.put("foreign_key",fks);
        }
        pkFkMap.put("table_alias",alias);
        n4PkFkMapping.put(inTableName,pkFkMap);
        return pkFkMap;
    }
}
