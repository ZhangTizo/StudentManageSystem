package com.ak.student.action;

import com.ak.student.dao.impl.ClassesDaoImpl;
import com.ak.student.dao.impl.GradeDaoImpl;
import com.ak.student.dao.impl.StudentDaoImpl;
import com.ak.student.entity.Grade;
import com.ak.student.entity.Grades;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "GradeListServlet",value = "/manage/grade/GradeListServlet")
public class GradeListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        GradeDaoImpl gdi = new GradeDaoImpl();
        StudentDaoImpl sdi = new StudentDaoImpl();
        ClassesDaoImpl cdi = new ClassesDaoImpl();
        PrintWriter out = response.getWriter();
        String method = request.getParameter("method");
        ArrayList<Grades> gradeList = null;
        try {
            gradeList = Grades.getGradeList(gdi.getList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        int pages = gradeList.size()/10+1;
        if (method == null) {
            ArrayList<Grades> list = new ArrayList<>();
            for(int i = 0;i<10 && i<gradeList.size();i++){
                list.add(gradeList.get(i));
            }
            int currentPages = 1;
            request.setAttribute("currentPages",currentPages);
            request.setAttribute("pages",pages);
            request.setAttribute("gradeList", list);
            request.getRequestDispatcher("list.jsp").forward(request, response);
        }
        else {
            if(method.equals("update")){
                try {
                    request.setAttribute("grade",gdi.getOne(request.getParameter("post1"),request.getParameter("post2")));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                request.getRequestDispatcher("update.jsp").forward(request,response);
            }
            else if(method.equals("insert")){
                response.sendRedirect("insert.jsp");
            }
            else if(method.equals("delete")){
                String s_no = request.getParameter("post1");
                String c_no = request.getParameter("post2");
                try{
                    System.out.println(gdi.delete(s_no,c_no));
                }catch (Exception e){}
                response.sendRedirect("GradeListServlet");
            }
            else if(method.equals("up")){
                int currentPages = Integer.parseInt(request.getParameter("post"));
                if(currentPages<=1){
                    out.print("<html>" +
                            "<body>" +
                            "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                            "           alert(\'已经在第一页了！！！\');\n" +
                            "           window.document.location.href=\'GradeListServlet\';\n" +
                            "</script>" +
                            "</body>");
                }
                else {
                    ArrayList<Grades> list = new ArrayList<>();
                    currentPages--;
                    for(int i = currentPages * 10 - 10;i<currentPages*10 && i<gradeList.size();i++){
                        list.add(gradeList.get(i));
                    }
                    request.setAttribute("currentPages",currentPages);
                    request.setAttribute("pages",pages);
                    request.setAttribute("gradeList", list);
                    request.getRequestDispatcher("list.jsp").forward(request, response);
                }
            }
            else if(method.equals("down")){
                int currentPages = Integer.parseInt(request.getParameter("post"));
                if(currentPages>=pages){
                    out.print("<html>" +
                            "<body>" +
                            "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                            "           alert(\'已经在第最后一页了！！！\');\n" +
                            "           window.document.location.href=\'GradeListServlet\';\n" +
                            "</script>" +
                            "</body>");
                }
                else {
                    ArrayList<Grades> list = new ArrayList<>();
                    currentPages++;
                    for(int i = currentPages * 10 - 10;i<currentPages*10 && i<gradeList.size();i++){
                        list.add(gradeList.get(i));
                    }
                    request.setAttribute("currentPages",currentPages);
                    request.setAttribute("pages",pages);
                    request.setAttribute("gradeList", list);
                    request.getRequestDispatcher("list.jsp").forward(request, response);
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
