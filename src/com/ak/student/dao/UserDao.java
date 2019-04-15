package com.ak.student.dao;

import com.ak.student.entity.User;

import java.util.ArrayList;

public interface UserDao {
    public int insert(User user) throws Exception;
    public int update(User user) throws Exception;
    public int delete(int id) throws Exception;
    public User getOne(String username) throws Exception;
    public ArrayList<User> getList() throws Exception;
}
