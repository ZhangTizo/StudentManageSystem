package com.ak.student.entity;
/**
 * 声明一个类
 *
 * */
public class Classes {
    private int id;
    private String c_no;
    private String c_name;
    private String t_no;
    private String memo;

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", c_no='" + c_no + '\'' +
                ", c_name='" + c_name + '\'' +
                ", t_no='" + t_no + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }

    public String getC_no() {
        return c_no;
    }

    public void setC_no(String c_no) {
        this.c_no = c_no;
    }

    public String getT_no() {
        return t_no;
    }

    public void setT_no(String t_no) {
        this.t_no = t_no;
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

    public String getC_name() {
        return c_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
}
