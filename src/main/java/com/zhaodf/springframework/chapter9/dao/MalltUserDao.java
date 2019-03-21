package com.zhaodf.springframework.chapter9.dao;


import com.zhaodf.springframework.chapter9.model.MalltUser;

public interface MalltUserDao {
    public int insert(MalltUser malltUser);
    public MalltUser findMalltUserById(int id);
}
