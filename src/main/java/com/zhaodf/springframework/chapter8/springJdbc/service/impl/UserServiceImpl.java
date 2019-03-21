package com.zhaodf.springframework.chapter8.springJdbc.service.impl;

import com.zhaodf.springframework.chapter8.springJdbc.User;
import com.zhaodf.springframework.chapter8.springJdbc.UserMapper;
import com.zhaodf.springframework.chapter8.springJdbc.service.UserService;
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
    }

    @Override
    public List<User> getUsers() {
        List<User> userList = jdbcTemplate.query("select * from user",new UserMapper());
        return userList;
    }
}
