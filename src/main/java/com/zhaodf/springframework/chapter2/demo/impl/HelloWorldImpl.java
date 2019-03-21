package com.zhaodf.springframework.chapter2.demo.impl;

import com.zhaodf.springframework.chapter2.demo.HelloWorldApi;

public class HelloWorldImpl implements HelloWorldApi {
    @Override
    public void sayHello() {
        System.out.println("HelloWorld,zhaodf");
    }
}
