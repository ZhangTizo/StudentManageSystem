package com.ak.student.dao;

import com.ak.student.entity.Grade;

import java.util.ArrayList;

public interface GradeDao {
    public int insert(Grade grade) throws Exception;
    public int update(Grade grade) throws Exception;
    public int delete(String s_no, String c_no) throws Exception;
    public Grade getOne(String s_no, String c_no) throws Exception;
    public ArrayList<Grade> getList() throws Exception;
}
