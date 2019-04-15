package com.ak.student.entity;

public class Teacher {
    private int id;
    private String t_no;
    private String t_name;
    private int t_sex;
    private int t_age;
    private String memo;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", t_no='" + t_no + '\'' +
                ", t_name='" + t_name + '\'' +
                ", t_sex=" + t_sex +
                ", t_age=" + t_age +
                ", memo='" + memo + '\'' +
                '}';
    }

    public int getT_sex() {
        return t_sex;
    }

    public void setT_sex(int t_sex) {
        this.t_sex = t_sex;
    }

    public int getT_age() {
        return t_age;
    }

    public void setT_age(int t_age) {
        this.t_age = t_age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getT_no() {
        return t_no;
    }

    public void setT_no(String t_no) {
        this.t_no = t_no;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
