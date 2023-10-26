package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;

public interface DemoProjection {

    @JsonIgnore
    @Value("#{@demoService.getError()}")
    String openProjection();

    default String getError() {
        return openProjection();
    };
}
