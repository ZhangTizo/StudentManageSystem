package com.ak.student.dao;
/**
 * 实现sql语句的接口
 *
 * */
import com.ak.student.entity.Classes;

import java.util.ArrayList;

public interface ClassesDao {
    public int insert(Classes classes) throws Exception;
    public int update(Classes classes) throws Exception;
    public int delete(int id) throws Exception;
    public Classes getOne(int id) throws Exception;
    public ArrayList<Classes> getList() throws Exception;
}
