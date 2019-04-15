package com.ak.student.dao.impl;

import com.ak.student.util.DbUtil;
import com.ak.student.dao.StudentDao;
import com.ak.student.entity.Student;

import java.util.ArrayList;
import java.util.Map;
import java.util.spi.AbstractResourceBundleProvider;

public class StudentDaoImpl implements StudentDao {

    @Override
    public int insert(Student student) throws Exception {
        String sql = "insert into student(s_no,s_name,s_sex,s_age,memo) values(?,?,?,?,?)";
        ArrayList<Object> list = new ArrayList<>();
        list.add(student.getS_no());
        list.add(student.getS_name());
        list.add(student.getS_sex());
        list.add(student.getS_age());
        list.add(student.getMemo());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int update(Student student) throws Exception {
        String sql = "update student set s_no = ?, s_name = ? ,s_sex = ?,s_age = ?, memo = ? where id = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(student.getS_no());
        list.add(student.getS_name());
        list.add(student.getS_sex());
        list.add(student.getS_age());
        list.add(student.getMemo());
        list.add(student.getId());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int delete(int id) throws Exception {
        String sql = "delete from student where id = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(id);
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public Student getOne(int id) throws Exception {
        Student student = null;
        String sql = "select * from student where id = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(id);
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            student = new Student();
            student.setId((int)m.get("id"));
            student.setS_no((String)m.get("s_no"));
            student.setS_name((String)m.get("s_name"));
            student.setS_sex((int)m.get("s_sex"));
            student.setS_age((int)m.get("s_age"));
            student.setMemo((String)m.get("memo"));
        }
        return student;
    }

    public Student getOne(String s_no) throws Exception {
        Student student = null;
        String sql = "select * from student where s_no = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(s_no);
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            student = new Student();
            student.setId((int)m.get("id"));
            student.setS_no((String)m.get("s_no"));
            student.setS_name((String)m.get("s_name"));
            student.setS_sex((int)m.get("s_sex"));
            student.setS_age((int)m.get("s_age"));
            student.setMemo((String)m.get("memo"));
        }
        return student;
    }

    public ArrayList<String> getS_no(String s_name) throws Exception {
        ArrayList<String> s_noList = new ArrayList<>();
        String sql = "select * from student where s_name like ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add("%"+s_name+"%");
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            s_noList.add((String)m.get("s_no"));
        }
        return s_noList;
    }

    @Override
    public ArrayList<Student> getList() throws Exception {
        ArrayList<Student> studentList = new ArrayList<>();
        String sql = "select * from student";
        for(Map<String,Object> m:DbUtil.executeQuery(sql,null)){
            Student student = new Student();
            student.setId((int)m.get("id"));
            student.setS_no((String)m.get("s_no"));
            student.setS_name((String)m.get("s_name"));
            student.setS_sex((int)m.get("s_sex"));
            student.setS_age((int)m.get("s_age"));
            student.setMemo((String)m.get("memo"));
            studentList.add(student);
        }
        return studentList;
    }

    public ArrayList<Student> getList(String s_name) throws Exception {
        ArrayList<Student> studentList = new ArrayList<>();
        String sql = "select * from student where s_name like ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add("%"+s_name+"%");
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            Student student = new Student();
            student.setId((int)m.get("id"));
            student.setS_no((String)m.get("s_no"));
            student.setS_name((String)m.get("s_name"));
            student.setS_sex((int)m.get("s_sex"));
            student.setS_age((int)m.get("s_age"));
            student.setMemo((String)m.get("memo"));
            studentList.add(student);
        }
        return studentList;
    }
}
