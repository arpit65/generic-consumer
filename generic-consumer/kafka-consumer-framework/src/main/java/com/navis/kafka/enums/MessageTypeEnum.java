package com.navis.kafka.enums;

public enum MessageTypeEnum {

    JSON("json");

    MessageTypeEnum(String inType){
        this.type = inType;
    }

    private String type;

    public String getType() {
        return type;
    }
}
