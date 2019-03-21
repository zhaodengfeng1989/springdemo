package com.zhaodf.springframework.chapter2.lookupMethod;

public abstract class GetBeanTest {
    public void showMe(){
        this.getBean().showMe();
    }

    public abstract Person getBean();
}
