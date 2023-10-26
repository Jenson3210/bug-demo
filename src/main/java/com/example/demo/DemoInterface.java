package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonTypeName("interface")
public interface DemoInterface {
    @JsonIgnore
    default String fieldCalculation() {
        throw new RuntimeException("Error thrown through interface logic");
    }

    default String getError() {
        return fieldCalculation();
    };
}
