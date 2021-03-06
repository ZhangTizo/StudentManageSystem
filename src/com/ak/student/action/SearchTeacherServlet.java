package com.ak.student.action;

import com.ak.student.dao.impl.TeacherDaoImpl;
import com.ak.student.entity.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "SearchTeacherServlet",value = "/manage/teacher/SearchTeacherServlet")
public class SearchTeacherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String t_name = request.getParameter("t_name");
        TeacherDaoImpl tdi = new TeacherDaoImpl();
        PrintWriter out = response.getWriter();
        if(request.getParameter("page")!=null){
            if(request.getParameter("page").equals("")){
                out.print("<html>" +
                        "<body>" +
                        "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                        "           alert(\'页号不能为空！！！\');\n" +
                        "           window.document.location.href=\'TeacherListServlet\';\n" +
                        "</script>" +
                        "</body>");
            }
            else {
                ArrayList<Teacher> teacherList = null;
                try {
                    teacherList = tdi.getList();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                int pages = teacherList.size()/10+1;
                int page = Integer.parseInt(request.getParameter("page"));
                System.out.println(page+" "+(teacherList.size()/10+1));
                if(page>teacherList.size()/10+1 || page<1){
                    out.print("<html>" +
                            "<body>" +
                            "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                            "           alert(\'该页面不存在！！！\');\n" +
                            "           window.document.location.href=\'TeacherListServlet\';\n" +
                            "</script>" +
                            "</body>"+ "</html>");
                }
                ArrayList<Teacher> list = new ArrayList<>();
                for(int i = page * 10 - 10;i<page*10 && i<teacherList.size();i++){
                    list.add(teacherList.get(i));
                }
                request.setAttribute("currentPages",page);
                request.setAttribute("pages",pages);
                request.setAttribute("teacherList", list);
                request.getRequestDispatcher("list.jsp").forward(request, response);
            }
        }
        try {
            request.setAttribute("teacherList",tdi.getList(t_name));
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
