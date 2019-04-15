package com.ak.student.action;

import com.ak.student.entity.Classes;
import com.ak.student.dao.impl.ClassesDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateClassesServlet",value = "/manage/classes/UpdateClassesServlet")
public class UpdateClassesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        ClassesDaoImpl cdi = new ClassesDaoImpl();
        if(request.getParameter("id")==null){
            String c_no = request.getParameter("c_no");
            String c_name = request.getParameter("c_name");
            String t_no = request.getParameter("t_no");
            String memo = request.getParameter("memo");
            Classes classes = new Classes();
            classes.setC_name(c_name);
            classes.setC_no(c_no);
            classes.setT_no(t_no);
            classes.setMemo(memo);
            try {
                System.out.println("---insert---");
                System.out.println(cdi.insert(classes));
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.sendRedirect("ClassesListServlet");
        }
        else {
            int id = Integer.valueOf(request.getParameter("id"));
            String c_no = request.getParameter("c_no");
            String c_name = request.getParameter("c_name");
            String t_no = request.getParameter("t_no");
            String memo = request.getParameter("memo");
            Classes classes = new Classes();
            classes.setC_name(c_name);
            classes.setC_no(c_no);
            classes.setT_no(t_no);
            classes.setMemo(memo);
            classes.setId(id);
            try{
                System.out.println("---update---");
                System.out.println(cdi.update(classes));
            }catch (Exception e){
                e.printStackTrace();
            }
            response.sendRedirect("ClassesListServlet");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
