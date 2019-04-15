package com.ak.student.action;

import com.ak.student.entity.Student;
import com.ak.student.dao.impl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateStudentServlet",value = "/manage/student/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        StudentDaoImpl sdi = new StudentDaoImpl();
        if(request.getParameter("id")==null){
            String s_no = request.getParameter("s_no");
            String s_name = request.getParameter("s_name");
            String memo = request.getParameter("memo");
            int s_sex = Integer.valueOf(request.getParameter("s_sex"));
            int s_age = Integer.valueOf(request.getParameter("s_age"));
            Student student = new Student();
            student.setS_name(s_name);
            student.setS_no(s_no);
            student.setS_sex(s_sex);
            student.setS_age(s_age);
            student.setMemo(memo);
            try {
                System.out.println("---insert---");
                System.out.println(sdi.insert(student));
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.sendRedirect("StudentListServlet");
        }
        else {
            int id = Integer.valueOf(request.getParameter("id"));
            String s_no = request.getParameter("s_no");
            String s_name = request.getParameter("s_name");
            String memo = request.getParameter("memo");
            int s_sex = Integer.valueOf(request.getParameter("s_sex"));
            int s_age = Integer.valueOf(request.getParameter("s_age"));
            Student student = new Student();
            student.setId(id);
            student.setS_name(s_name);
            student.setS_no(s_no);
            student.setS_sex(s_sex);
            student.setS_age(s_age);
            student.setMemo(memo);
            try{
                System.out.println("---update---");
                System.out.println(sdi.update(student));
            }catch (Exception e){
                e.printStackTrace();
            }
            response.sendRedirect("StudentListServlet");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
