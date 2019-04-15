package com.ak.student.dao;

import com.ak.student.entity.Teacher;

import java.util.ArrayList;

public interface TeacherDao {
    public int insert(Teacher teacher) throws Exception;
    public int update(Teacher teacher) throws Exception;
    public int delete(int id) throws Exception;
    public Teacher getOne(int id) throws Exception;
    public ArrayList<Teacher> getList() throws Exception;
}
