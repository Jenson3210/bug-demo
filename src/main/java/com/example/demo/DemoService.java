package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public void getError() {
        throw new RuntimeException("Error thrown through projection");
    }
}
