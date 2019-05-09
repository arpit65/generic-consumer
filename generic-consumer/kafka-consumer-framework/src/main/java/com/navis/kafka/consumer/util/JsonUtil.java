/*
 * Copyright (c) 2017 Navis LLC. All Rights Reserved.
 *
 */
package com.navis.kafka.consumer.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Json helper functions to convert from and to json
 *
 * Underneath it will use Jackson jar to handle json payload
 *
 * @author Mallik Ankati
 *
 */
public final class JsonUtil {

    private static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,
                false);
        //mapper.setSerializationInclusion(Include.NON_NULL);
    }

    public static ObjectMapper getObjectMapper() {
        return mapper;
    }

    /**
     * Convert the json string to class type
     * @param inJsonStr Json String
     * @param inClazz class name
     * @param <T> Class Type Object
     * @return Object
     */
    public static <T> T fromJson(String inJsonStr, Class<T> inClazz) {
        T value = null;
        try {
            value = getObjectMapper().readValue(inJsonStr, inClazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    /**
     * Convert the Json String to Reference Type object
     * @param inJsonStr Json String
     * @param inReference Reference Type
     * @param <T> Type
     * @return Object
     */
    public static <T> T fromJson(String inJsonStr, TypeReference<T> inReference) {
        T value = null;
        try {
            value = getObjectMapper().readValue(inJsonStr,
                    new TypeReference<T>() {
                    });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    /**
     * Converts the object to json string
     * @param inSource Source Object
     * @return String
     */
    public static String toJson(Object inSource) {
        String json = null;
        try {
            json = getObjectMapper().writeValueAsString(inSource);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return json;
    }
}
