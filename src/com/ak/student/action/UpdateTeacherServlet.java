package com.ak.student.action;

import com.ak.student.dao.impl.TeacherDaoImpl;
import com.ak.student.entity.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateTeacherServlet",value = "/manage/teacher/UpdateTeacherServlet")
public class UpdateTeacherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        TeacherDaoImpl tdi = new TeacherDaoImpl();
        if(request.getParameter("id")==null){
            Teacher teacher = new Teacher();
            String t_no = request.getParameter("t_no");
            String t_name = request.getParameter("t_name");
            int t_sex = Integer.parseInt(request.getParameter("t_sex"));
            int t_age = Integer.parseInt(request.getParameter("t_age"));
            String memo = request.getParameter("memo");
            teacher.setT_no(t_no);
            teacher.setT_name(t_name);
            teacher.setT_sex(t_sex);
            teacher.setT_age(t_age);
            teacher.setMemo(memo);
            try {
                tdi.insert(teacher);
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.sendRedirect("TeacherListServlet");
        }
        else {
            Teacher teacher = new Teacher();
            int id = Integer.parseInt(request.getParameter("id"));
            String t_no = request.getParameter("t_no");
            String t_name = request.getParameter("t_name");
            int t_sex = Integer.parseInt(request.getParameter("t_sex"));
            int t_age = Integer.parseInt(request.getParameter("t_age"));
            String memo = request.getParameter("memo");
            teacher.setId(id);
            teacher.setT_no(t_no);
            teacher.setT_name(t_name);
            teacher.setT_sex(t_sex);
            teacher.setT_age(t_age);
            teacher.setMemo(memo);
            try {
                tdi.update(teacher);
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.sendRedirect("TeacherListServlet");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
