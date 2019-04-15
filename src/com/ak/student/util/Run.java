package com.ak.student.util;

import com.ak.student.dao.impl.ClassesDaoImpl;
import com.ak.student.dao.impl.GradeDaoImpl;
import com.ak.student.dao.impl.StudentDaoImpl;
import com.ak.student.dao.impl.UserDaoImpl;

public class Run {
    public static void main(String[] args) {
        ClassesDaoImpl cdi = new ClassesDaoImpl();
        GradeDaoImpl gdi = new GradeDaoImpl();
        StudentDaoImpl sdi = new StudentDaoImpl();
        UserDaoImpl udi = new UserDaoImpl();
        try{
            //udi.getList().forEach(x-> System.out.println(x.getUsername()));
            //cdi.getList().forEach(x-> System.out.println(x.getC_name()));
            //sdi.getList().forEach(x -> System.out.println(x.getS_name()));
            //gdi.getList().forEach(x-> System.out.println(x.getS_id()+" "+x.getC_id()+" "+x.getGrade()));

        }catch (Exception e){}

    }
}
