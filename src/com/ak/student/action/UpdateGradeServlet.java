package com.ak.student.action;

import com.ak.student.entity.Grade;
import com.ak.student.dao.impl.GradeDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateGradeServlet",value = "/manage/grade/UpdateGradeServlet")
public class UpdateGradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        GradeDaoImpl gdi = new GradeDaoImpl();
        String s_no = request.getParameter("s_no");
        String c_no = request.getParameter("c_no");
        int gr = Integer.valueOf(request.getParameter("grade"));
        String memo = request.getParameter("memo");
        Grade grade = new Grade();
        grade.setS_no(s_no);
        grade.setC_no(c_no);
        grade.setGrade(gr);
        grade.setMemo(memo);
        try {
            if(gdi.getOne(s_no,c_no)==null){
                System.out.println("------grade----insert-------");
                System.out.println(gdi.insert(grade));
            }
            else {
                System.out.println("------grade----update-------");
                System.out.println(gdi.update(grade));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("GradeListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
