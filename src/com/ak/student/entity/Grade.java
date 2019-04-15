package com.ak.student.entity;

public class Grade {
    private int id;
    private String s_no;
    private String c_no;
    private int grade;
    private String memo;

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", s_no='" + s_no + '\'' +
                ", c_no='" + c_no + '\'' +
                ", grade=" + grade +
                ", memo='" + memo + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS_no() {
        return s_no;
    }

    public void setS_no(String s_no) {
        this.s_no = s_no;
    }

    public String getC_no() {
        return c_no;
    }

    public void setC_no(String c_no) {
        this.c_no = c_no;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
