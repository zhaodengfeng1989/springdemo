package com.zhaodf.springframework;

import com.zhaodf.springframework.chapter2.constructorArg.Person;
import com.zhaodf.springframework.chapter2.customElement.UserDemo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.ClassUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String[] ary = StringUtils.tokenizeToStringArray("1,2,, ,4,5,6",",");
        System.out.println(ary[2]);
        //===================lookup-method测试======================
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        GetBeanTest test = (GetBeanTest) context.getBean("getBeanTest");
//        test.showMe();
        //===================replaced-method测试======================
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        CollegeStudents test = (CollegeStudents) context.getBean("collegeStudent");
//        test.changMe();
        //===================constructor-arg测试======================
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter2/applicationContext.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.getName());
        System.out.println(person.getMap().get("one"));
        //===================自定义标签===============================
        context = new ClassPathXmlApplicationContext("chapter2/applicationContext.xml");
        UserDemo userDemo = (UserDemo) context.getBean("testBean");
        System.out.println(userDemo.getEmail());
        //===================工具类积累PropertiesLoaderUtils（加载配置文件）===============================
        try {
            //必须在classpath路径下
            Properties mappings =
                    PropertiesLoaderUtils.loadAllProperties("chapter2/prop.properties", ClassUtils.getDefaultClassLoader());
            System.out.println(mappings.getProperty("zhaodf"));
            Map<String,Object> handlerMappings = new ConcurrentHashMap<>();
            CollectionUtils.mergePropertiesIntoMap(mappings,handlerMappings);
            System.out.println(handlerMappings.get("dengyj"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
