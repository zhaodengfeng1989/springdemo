package com.zhaodf.springframework;

import com.zhaodf.springframework.chapter8.springJdbc.User;
import com.zhaodf.springframework.chapter8.springJdbc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringJdbcTest {
    @Test
    public void testSpringJdbc() {
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter8/springJdbc.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setName("zhaodf");
        user.setAge(28);
        user.setSex("male");
        userService.save(user);
        //3、执行业务逻辑
        List<User> userList = userService.getUsers();
        System.out.println(userList.size());
    }
}
