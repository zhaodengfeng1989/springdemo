package com.zhaodf.springframework.chapter2.replacedMethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class CollegeStudentsReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("我们需要一个研究生，你被替换了");
        return null;
    }
}
