package com.ak.student.action;

import com.ak.student.dao.impl.ClassesDaoImpl;
import com.ak.student.entity.Grade;
import com.ak.student.dao.impl.GradeDaoImpl;
import com.ak.student.dao.impl.StudentDaoImpl;
import com.ak.student.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;

@WebServlet(name = "GradeTableServlet",value = "/manage/table/GradeTableServlet")
public class GradeTableServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        StudentDaoImpl sdi = new StudentDaoImpl();
        ClassesDaoImpl cdi = new ClassesDaoImpl();
        GradeDaoImpl gdi = new GradeDaoImpl();

        if(request.getParameter("post")==null){
            TreeSet<String> ts = new TreeSet<>();
            ArrayList<Student> studentList = new ArrayList<>();
            try {
                for(Grade g : gdi.getList()){
                    ts.add(g.getS_no());
                }
                for(String s_no : ts){
                    studentList.add(sdi.getOne(s_no));
                }
                request.setAttribute("studentList",studentList);
            } catch (Exception e) {
                e.printStackTrace();
            }
            request.getRequestDispatcher("list.jsp").forward(request,response);
        }
        else {
            int id = Integer.valueOf(request.getParameter("post"));
            try {
                String name = sdi.getOne(id).getS_name();
                ArrayList<Grade> gradeList = gdi.getList(sdi.getOne(id).getS_no(),"");
                StringBuilder grade = new StringBuilder("[");
                StringBuilder classes = new StringBuilder("[");
                for(int i = 0;i<gradeList.size()-1;i++){
                    String s_no = gradeList.get(i).getS_no();
                    String c_no = gradeList.get(i).getC_no();
                    grade.append(gdi.getOne(s_no,c_no).getGrade()).append(",");
                    classes.append("'").append(cdi.getOne(c_no).getC_name()).append("',");
                }
                String s_no = gradeList.get(gradeList.size()-1).getS_no();
                String c_no = gradeList.get(gradeList.size()-1).getC_no();
                grade.append(gdi.getOne(s_no,c_no).getGrade()).append("]");
                classes.append("'").append(cdi.getOne(c_no).getC_name()).append("']");
                System.out.println(name);
                System.out.println(grade.toString());
                System.out.println(classes.toString());
                request.setAttribute("name",name);
                request.setAttribute("grade",grade);
                request.setAttribute("classes",classes);
                request.getRequestDispatcher("table.jsp").forward(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
