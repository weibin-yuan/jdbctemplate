package com.ywb.dao;

import com.ywb.entity.User;

import java.util.List;

public interface CardDao {
    void add(User user);
    boolean del(Integer id);
    boolean update(User user);
    List<User> getAll();
    User selectById(Integer id);
    User selectByName(String name);
    User selectByNumber(int number);
    int count();
}
