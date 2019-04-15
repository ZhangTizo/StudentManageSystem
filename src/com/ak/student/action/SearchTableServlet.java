package com.ak.student.action;

import com.ak.student.dao.impl.GradeDaoImpl;
import com.ak.student.dao.impl.StudentDaoImpl;
import com.ak.student.entity.Grade;
import com.ak.student.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.TreeSet;

@WebServlet(name = "SearchTableServlet" ,value = "/manage/table/SearchTableServlet")
public class SearchTableServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        GradeDaoImpl gdi = new GradeDaoImpl();
        StudentDaoImpl sdi = new StudentDaoImpl();
        String s_name = request.getParameter("s_name");
        PrintWriter out = response.getWriter();
        if (s_name.equals("")) {
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
        } else {
            ArrayList<String> s_noList = null;
            try {
                s_noList = gdi.getS_no(s_name);
            } catch (Exception e) {
                e.printStackTrace();
            }
            ArrayList<Student> studentList = new ArrayList<>();
            for (String s : s_noList) {
                try {
                    studentList.add(sdi.getOne(s));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                request.setAttribute("studentList", studentList);
            } catch (Exception e) {
                e.printStackTrace();
            }
            request.getRequestDispatcher("list.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
