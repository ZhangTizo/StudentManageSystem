package com.ak.student.entity;

import com.ak.student.dao.impl.ClassesDaoImpl;
import com.ak.student.dao.impl.StudentDaoImpl;

import java.util.ArrayList;

public class Grades {
    private int id;
    private String s_no;
    private String s_name;
    private String c_no;
    private String c_name;
    private int grade;
    private String memo;

    @Override
    public String toString() {
        return "Grades{" +
                "id=" + id +
                ", s_no='" + s_no + '\'' +
                ", s_name='" + s_name + '\'' +
                ", c_no='" + c_no + '\'' +
                ", c_name='" + c_name + '\'' +
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

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getC_no() {
        return c_no;
    }

    public void setC_no(String c_no) {
        this.c_no = c_no;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
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

    public static ArrayList<Grades> getGradeList(ArrayList<Grade> list) throws Exception {
        ArrayList<Grades> gradeList = new ArrayList<>();
        StudentDaoImpl sdi = new StudentDaoImpl();
        ClassesDaoImpl cdi = new ClassesDaoImpl();
        for(Grade g : list){
            Grades grades = new Grades();
            grades.setId(g.getId());
            grades.setS_no(g.getS_no());
            grades.setS_name(sdi.getOne(g.getS_no()).getS_name());
            grades.setC_no(g.getC_no());
            grades.setC_name(cdi.getOne(g.getC_no()).getC_name());
            grades.setGrade(g.getGrade());
            grades.setMemo(g.getMemo());
            gradeList.add(grades);
        }
        return gradeList;
    }

}
