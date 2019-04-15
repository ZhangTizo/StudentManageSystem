package com.ak.student.dao.impl;
/**
 * 加载数据库驱动
 *
 * */
import com.ak.student.util.DbUtil;
import com.ak.student.entity.Classes;
import com.ak.student.dao.ClassesDao;

import java.util.ArrayList;
import java.util.Map;

public class ClassesDaoImpl implements ClassesDao {

    @Override
    public int insert(Classes classes) throws Exception {
        String sql = "insert into classes(c_no,c_name,t_no,memo) values(?,?,?,?) ";
        ArrayList<Object> list = new ArrayList<>();
        list.add(classes.getC_no());
        list.add(classes.getC_name());
        list.add(classes.getT_no());
        list.add(classes.getMemo());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int update(Classes classes) throws Exception {
        String sql = "update classes set c_no = ?, c_name = ?,t_no = ?, memo = ? where id = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(classes.getC_no());
        list.add(classes.getC_name());
        list.add(classes.getT_no());
        list.add(classes.getMemo());
        list.add(classes.getId());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int delete(int id) throws Exception {
        String sql = "delete from classes where id = ? ";
        ArrayList<Object> list = new ArrayList<>();
        list.add(id);
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public ArrayList<Classes> getList() throws Exception {
        ArrayList<Classes> classesList = new ArrayList<>();
        String sql = "select * from classes";
        for(Map<String,Object> m:DbUtil.executeQuery(sql,null)){
            Classes classes = new Classes();
            classes.setId((int)m.get("id"));
            classes.setC_no((String)m.get("c_no"));
            classes.setC_name((String)m.get("c_name"));
            classes.setT_no((String)m.get("t_no"));
            classes.setMemo((String)m.get("memo"));
            classesList.add(classes);
        }
        return classesList;
    }

    public ArrayList<Classes> getList(String c_name) throws Exception {
        ArrayList<Classes> classesList = new ArrayList<>();
        String sql = "select * from classes where c_name like ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add("%"+c_name+"%");
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            Classes classes = new Classes();
            classes.setId((int)m.get("id"));
            classes.setC_no((String)m.get("c_no"));
            classes.setC_name((String)m.get("c_name"));
            classes.setT_no((String)m.get("t_no"));
            classes.setMemo((String)m.get("memo"));
            classesList.add(classes);
        }
        return classesList;
    }

    @Override
    public Classes getOne(int id) throws Exception {
        String sql = "select * from classes where id = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(id);
        Classes classes = null;
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            classes = new Classes();
            classes.setId((int)m.get("id"));
            classes.setC_no((String)m.get("c_no"));
            classes.setC_name((String)m.get("c_name"));
            classes.setT_no((String)m.get("t_no"));
            classes.setMemo((String)m.get("memo"));
        }
        return classes;
    }

    public Classes getOne(String c_no) throws Exception {
        String sql = "select * from classes where c_no = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(c_no);
        Classes classes = null;
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            classes = new Classes();
            classes.setId((int)m.get("id"));
            classes.setC_no((String)m.get("c_no"));
            classes.setC_name((String)m.get("c_name"));
            classes.setT_no((String)m.get("t_no"));
            classes.setMemo((String)m.get("memo"));
        }
        return classes;
    }


}
