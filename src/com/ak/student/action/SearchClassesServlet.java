package com.ak.student.action;

import com.ak.student.dao.impl.ClassesDaoImpl;
import com.ak.student.entity.Classes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "SearchClassesServlet",value = "/manage/classes/SearchClassesServlet")
public class SearchClassesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String c_name = request.getParameter("c_name");
        ClassesDaoImpl cdi = new ClassesDaoImpl();
        PrintWriter out = response.getWriter();
        if(request.getParameter("page")!=null){
            if(request.getParameter("page").equals("")){
                out.print("<html>" +
                        "<body>" +
                        "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                        "           alert(\'页号不能为空！！！\');\n" +
                        "           window.document.location.href=\'ClassesListServlet\';\n" +
                        "</script>" +
                        "</body>");
            }
            else {
                ArrayList<Classes> classesList = null;
                try {
                    classesList = cdi.getList();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                int pages = classesList.size()/10+1;
                int page = Integer.parseInt(request.getParameter("page"));
                if(page>classesList.size()/10+1 || page<1){
                    out.print("<html>" +
                            "<body>" +
                            "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                            "           alert(\'该页面不存在！！！\');\n" +
                            "           window.document.location.href=\'ClassesListServlet\';\n" +
                            "</script>" +
                            "</body>"+ "</html>");
                }
                ArrayList<Classes> list = new ArrayList<>();
                for(int i = page * 10 - 10;i<page*10 && i<classesList.size();i++){
                    list.add(classesList.get(i));
                }
                request.setAttribute("currentPages",page);
                request.setAttribute("pages",pages);
                request.setAttribute("classesList", list);
                request.getRequestDispatcher("list.jsp").forward(request, response);
            }
        }
        try {
            request.setAttribute("classesList",cdi.getList(c_name));
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
