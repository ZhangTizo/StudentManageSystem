package com.ak.student.dao.impl;

import com.ak.student.dao.TeacherDao;
import com.ak.student.entity.Teacher;
import com.ak.student.util.DbUtil;

import java.util.ArrayList;
import java.util.Map;

public class TeacherDaoImpl implements TeacherDao {
    @Override
    public int insert(Teacher teacher) throws Exception {
        String sql = "insert into teacher(t_no,t_name,t_sex,t_age,memo) values(?,?,?,?,?)";
        ArrayList<Object> list = new ArrayList<>();
        list.add(teacher.getT_no());
        list.add(teacher.getT_name());
        list.add(teacher.getT_sex());
        list.add(teacher.getT_age());
        list.add(teacher.getMemo());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int update(Teacher teacher) throws Exception {
        String sql = "update teacher set t_no = ?, t_name = ?, t_sex = ?, t_age = ?, memo = ? where id = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(teacher.getT_no());
        list.add(teacher.getT_name());
        list.add(teacher.getT_sex());
        list.add(teacher.getT_age());
        list.add(teacher.getMemo());
        list.add(teacher.getId());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int delete(int id) throws Exception {
        String sql = "delete from teacher where id = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(id);
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public Teacher getOne(int id) throws Exception {
        Teacher teacher = null;
        String sql = "select * from teacher where id = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(id);
        for(Map<String,Object> m : DbUtil.executeQuery(sql,list)){
            teacher = new Teacher();
            teacher.setId((int)m.get("id"));
            teacher.setT_no((String)m.get("t_no"));
            teacher.setT_name((String)m.get("t_name"));
            teacher.setT_sex((int)m.get("t_sex"));
            teacher.setT_age((int)m.get("t_age"));
            teacher.setMemo((String)m.get("memo"));
        }
        return teacher;
    }

    @Override
    public ArrayList<Teacher> getList() throws Exception {
        String sql = "select * from teacher";
        ArrayList<Teacher> teacherList = new ArrayList<>();
        for(Map<String,Object> m : DbUtil.executeQuery(sql,null)){
            Teacher teacher = new Teacher();
            teacher.setId((int)m.get("id"));
            teacher.setT_no((String)m.get("t_no"));
            teacher.setT_name((String)m.get("t_name"));
            teacher.setT_sex((int)m.get("t_sex"));
            teacher.setT_age((int)m.get("t_age"));
            teacher.setMemo((String)m.get("memo"));
            teacherList.add(teacher);
        }
        return teacherList;
    }

    public ArrayList<Teacher> getList(String t_name) throws Exception {
        String sql = "select * from teacher where t_name like ?";
        ArrayList<Teacher> teacherList = new ArrayList<>();
        ArrayList<Object> list = new ArrayList<>();
        list.add("%"+t_name+"%");
        for(Map<String,Object> m : DbUtil.executeQuery(sql,list)){
            Teacher teacher = new Teacher();
            teacher.setId((int)m.get("id"));
            teacher.setT_no((String)m.get("t_no"));
            teacher.setT_name((String)m.get("t_name"));
            teacher.setT_sex((int)m.get("t_sex"));
            teacher.setT_age((int)m.get("t_age"));
            teacher.setMemo((String)m.get("memo"));
            teacherList.add(teacher);
        }
        return teacherList;
    }
}
