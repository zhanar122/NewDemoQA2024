package com.demoqa.enums;

import lombok.Getter;

@Getter

public enum EndPointsEnum {

    ALERT("/alerts"),

    FRAMES("/frames");


    String endpoint;

    EndPointsEnum(String endpoint){
        this.endpoint= endpoint;
    }

}
