package com.example.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
//public class ControllerExceptionHandler {}
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {}
