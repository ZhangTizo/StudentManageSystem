package com.ak.student.dao;

import com.ak.student.entity.Student;

import java.util.ArrayList;

public interface StudentDao {
    public int insert(Student student) throws Exception;
    public int update(Student student) throws Exception;
    public int delete(int id) throws Exception;
    public Student getOne(int id) throws Exception;
    public ArrayList<Student> getList() throws Exception;
}
