package com.ak.student.dao.impl;

import com.ak.student.dao.GradeDao;
import com.ak.student.util.DbUtil;
import com.ak.student.entity.Grade;

import java.util.ArrayList;
import java.util.Map;

public class GradeDaoImpl implements GradeDao {

    @Override
    public int insert(Grade grade) throws Exception {
        String sql = "insert into grade(s_no,c_no,grade,memo) values(?,?,?,?)";
        ArrayList<Object> list = new ArrayList<>();
        list.add(grade.getS_no());
        list.add(grade.getC_no());
        list.add(grade.getGrade());
        list.add(grade.getMemo());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int update(Grade grade) throws Exception {
        String sql = "update grade set grade = ?, memo = ? where s_no = ? and c_no = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(grade.getGrade());
        list.add(grade.getMemo());
        list.add(grade.getS_no());
        list.add(grade.getC_no());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int delete(String s_no,String c_no) throws Exception {
        String sql = "delete from grade where s_no = ? and c_no = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(s_no);
        list.add(c_no);
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public Grade getOne(String s_no,String c_no) throws Exception {
        String sql = "select * from grade where s_no = ? and c_no = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(s_no);
        list.add(c_no);
        Grade grade = null;
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            grade = new Grade();
            grade.setId((int)m.get("id"));
            grade.setS_no((String)m.get("s_no"));
            grade.setC_no((String)m.get("c_no"));
            grade.setGrade((int)m.get("grade"));
            grade.setMemo((String)m.get("memo"));
        }
        return grade;
    }

    public Grade getOne(String s_no) throws Exception {
        String sql = "select * from grade where s_no = ? ";
        ArrayList<Object> list = new ArrayList<>();
        list.add(s_no);
        Grade grade = null;
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            grade = new Grade();
            grade.setId((int)m.get("id"));
            grade.setS_no((String)m.get("s_no"));
            grade.setC_no((String)m.get("c_no"));
            grade.setGrade((int)m.get("grade"));
            grade.setMemo((String)m.get("memo"));
        }
        return grade;
    }

    public ArrayList<Grade> getList(String s_no,String c_no) throws Exception {
        ArrayList<Grade> gradeList = new ArrayList<>();
        String sql = "";
        if(!s_no.equals("") && !c_no.equals("")){
            sql = "select * from grade where s_no = ? and c_no = ?";
        }
        else {
            sql = "select * from grade where s_no = ? or c_no = ?";
        }
        ArrayList<Object> list = new ArrayList<>();
        list.add(s_no);
        list.add(c_no);
        for(Map<String,Object> m:DbUtil.executeQuery(sql,list)){
            Grade grade = new Grade();
            grade.setId((int)m.get("id"));
            grade.setS_no((String)m.get("s_no"));
            grade.setC_no((String) m.get("c_no"));
            grade.setGrade((int)m.get("grade"));
            grade.setMemo((String) m.get("memo"));
            gradeList.add(grade);
        }
        return gradeList;
    }

    @Override
    public ArrayList<Grade> getList() throws Exception {
        ArrayList<Grade> gradeList = new ArrayList<>();
        String sql = "select * from grade";
        for(Map<String,Object> m:DbUtil.executeQuery(sql,null)){
            Grade grade = new Grade();
            grade.setId((int)m.get("id"));
            grade.setS_no((String)m.get("s_no"));
            grade.setC_no((String) m.get("c_no"));
            grade.setGrade((int)m.get("grade"));
            grade.setMemo((String) m.get("memo"));
            gradeList.add(grade);
        }
        return gradeList;
    }

    public ArrayList<String> getS_no(String s_name) throws Exception {
        StudentDaoImpl sdi = new StudentDaoImpl();
        ArrayList<String> s_noList = sdi.getS_no(s_name);
        return s_noList;
    }
}
