package com.zhaodf.springframework.chapter10.springTransaction.service.impl;

import com.zhaodf.springframework.chapter10.springTransaction.User;
import com.zhaodf.springframework.chapter10.springTransaction.UserMapper;
import com.zhaodf.springframework.chapter10.springTransaction.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserServiceImpl implements UserService {
    private JdbcTemplate jdbcTemplate;
    //设置数据源
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into user (name,age,sex) values (?,?,?)",new Object[]{user.getName(),user.getAge(),user.getSex()});
        //注意：默认情况下spring中的事务处理只对RuntimeException方法进行回滚，所以此处换成普通的Exception不会生效
        //throw new RuntimeException("测试异常抛出时，是否会插入数据！");
    }

    @Override
    public List<User> getUsers() {
        List<User> userList = jdbcTemplate.query("select * from user",new UserMapper());
        return userList;
    }
}
