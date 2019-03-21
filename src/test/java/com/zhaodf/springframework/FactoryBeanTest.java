package com.zhaodf.springframework;

import com.zhaodf.springframework.chapter2.factoryBean.Car;
import com.zhaodf.springframework.chapter2.factoryBean.CarFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {
    @Test
    public void testFactoryBean() {
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter2/factoryBean.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        Car car = (Car)context.getBean("car");
        //3、执行业务逻辑
        System.out.println(car.getBrand());
    }

    @Test
    public void testGetFactoryBean() {
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter2/factoryBean.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        CarFactoryBean carFactoryBean = (CarFactoryBean)context.getBean("&car");
        //3、执行业务逻辑
        System.out.println(carFactoryBean.getCarInfo());
    }
}
