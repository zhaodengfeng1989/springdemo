package com.zhaodf.springframework.chapter2.constructorArg;

import java.util.Map;
public  class Person {
    private String name;
    private int age;
    private Map<String,String> map;

    public Person(String name, int age, Map<String, String> map) {
        this.name = name;
        this.age = age;
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
