package com.ak.student.dao.impl;

import com.ak.student.entity.User;
import com.ak.student.util.DbUtil;
import com.ak.student.dao.UserDao;

import java.util.ArrayList;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    @Override
    public int insert(User user) throws Exception {
        String sql = "insert into user(username,password,user_sex,user_age,memo) values(?,?,?,?,?)";
        ArrayList<Object> list = new ArrayList<>();
        list.add(user.getUsername());
        list.add(user.getPassword());
        list.add(user.getUser_sex());
        list.add(user.getUser_age());
        list.add(user.getMemo());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int update(User user) throws Exception {
        String sql = "update user set password = ? , user_sex = ? , user_age = ? ,memo = ? where username = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(user.getPassword());
        list.add(user.getUser_sex());
        list.add(user.getUser_age());
        list.add(user.getMemo());
        list.add(user.getUsername());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int delete(int id) throws Exception {
        String sql = "delete from user where id = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(id);
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public User getOne(String username) throws Exception {
        String sql = "select * from user where username = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(username);
        User user = null;
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            user = new User();
            user.setId((int)m.get("id"));
            user.setUsername((String)m.get("username"));
            user.setPassword((String)m.get("password"));
            user.setUser_sex((int)m.get("user_sex"));
            user.setUser_age((int)m.get("user_age"));
            user.setMemo((String)m.get("memo"));
        }
        return user;
    }

    public ArrayList<User> getSearch(String username) throws Exception {
        String sql = "select * from user where username like ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add("%"+username+"%");
        ArrayList<User> userList = new ArrayList<>();
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            User user = new User();
            user.setId((int)m.get("id"));
            user.setUsername((String)m.get("username"));
            user.setPassword((String)m.get("password"));
            user.setUser_sex((int)m.get("user_sex"));
            user.setUser_age((int)m.get("user_age"));
            user.setMemo((String)m.get("memo"));
            userList.add(user);
        }
        return userList;
    }

    @Override
    public ArrayList<User> getList() throws Exception {
        String sql = "select * from user";
        ArrayList<User> userList = new ArrayList<>();
        for(Map<String,Object> m:DbUtil.executeQuery(sql,null)){
            User user = new User();
            user.setId((int)m.get("id"));
            user.setUsername((String)m.get("username"));
            user.setPassword((String)m.get("password"));
            user.setUser_sex((int)m.get("user_sex"));
            user.setUser_age((int)m.get("user_age"));
            user.setMemo((String)m.get("memo"));
            userList.add(user);
        }
        return userList;
    }
}
