package com.zhaodf.springframework;

import com.zhaodf.springframework.chapter8.springJdbc.User;
import com.zhaodf.springframework.chapter8.springJdbc.service.UserService;
import com.zhaodf.springframework.chapter9.dao.MalltUserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringMybatis {
    @Test
    public void testSpringMybatis() {
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("springMybatis.xml");
        MalltUserDao dao = (MalltUserDao) context.getBean("userMapper");
        dao.findMalltUserById(1);
    }
}
