package com.ak.student.entity;

public class Student {
    private int id;
    private String s_no;
    private String s_name;
    private int s_sex;
    private int s_age;
    private String memo;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", s_no='" + s_no + '\'' +
                ", s_name='" + s_name + '\'' +
                ", s_sex=" + s_sex +
                ", s_age=" + s_age +
                ", memo='" + memo + '\'' +
                '}';
    }

    public String getS_no() {
        return s_no;
    }

    public void setS_no(String s_no) {
        this.s_no = s_no;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public int getId() {
        return id;
    }

    public int getS_age() {
        return s_age;
    }

    public int getS_sex() {
        return s_sex;
    }

    public String getS_name() {
        return s_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setS_sex(int s_sex) {
        this.s_sex = s_sex;
    }

}
