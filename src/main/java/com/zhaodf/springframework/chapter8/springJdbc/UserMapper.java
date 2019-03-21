package com.zhaodf.springframework.chapter8.springJdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getInt("age"),resultSet.getString("sex"));
        return user;
    }
}
