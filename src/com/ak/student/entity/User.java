package com.ak.student.entity;

import java.util.Date;

public class User {
    private  int id;
    private  String username;
    private  String password;
    private  int user_sex;
    private  int user_age;
    private String memo;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user_sex=" + user_sex +
                ", user_age=" + user_age +
                ", memo='" + memo + '\'' +
                '}';
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUser_sex(int user_sex) {
        this.user_sex = user_sex;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public  int getId() {
        return id;
    }

    public  int getUser_age() {
        return user_age;
    }

    public  int getUser_sex() {
        return user_sex;
    }

    public  String getPassword() {
        return password;
    }

    public  String getUsername() {
        return username;
    }
}
