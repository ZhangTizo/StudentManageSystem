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

@WebServlet(name = "ClassesListServlet",value = "/manage/classes/ClassesListServlet")
public class ClassesListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String method = request.getParameter("method");
        PrintWriter out = response.getWriter();
        ClassesDaoImpl cdi = new ClassesDaoImpl();
        ArrayList<Classes> classesList = null;
        try {
            classesList = cdi.getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int pages = classesList.size()/10+1;
        if (method == null) {
            ArrayList<Classes> list = new ArrayList<>();
            for(int i = 0;i<10 && i<classesList.size();i++){
                list.add(classesList.get(i));
            }
            int currentPages = 1;
            request.setAttribute("currentPages",currentPages);
            request.setAttribute("pages",pages);
            request.setAttribute("classesList", list);
            request.getRequestDispatcher("list.jsp").forward(request, response);
        }
        else {
            if(method.equals("update")){
//                ClassesDaoImpl cdi = new ClassesDaoImpl();
                try {
                    request.setAttribute("classes",cdi.getOne(Integer.valueOf(request.getParameter("post"))));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                request.getRequestDispatcher("update.jsp").forward(request,response);
            }
            else if(method.equals("insert")){
                response.sendRedirect("insert.jsp");
            }
            else if(method.equals("delete")){
                int id = Integer.valueOf(request.getParameter("post"));
//                ClassesDaoImpl cdi = new ClassesDaoImpl();
                try{
                    System.out.println(cdi.delete(id));
                }catch (Exception e){}
                response.sendRedirect("ClassesListServlet");
            }
            else if(method.equals("up")){
                int currentPages = Integer.parseInt(request.getParameter("post"));
                if(currentPages<=1){
                    out.print("<html>" +
                            "<body>" +
                            "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                            "           alert(\'已经在第一页了！！！\');\n" +
                            "           window.document.location.href=\'ClassesListServlet\';\n" +
                            "</script>" +
                            "</body>");
                }
                else {
                    ArrayList<Classes> list = new ArrayList<>();
                    currentPages--;
                    for(int i = currentPages * 10 - 10;i<currentPages*10 && i<classesList.size();i++){
                        list.add(classesList.get(i));
                    }
                    request.setAttribute("currentPages",currentPages);
                    request.setAttribute("pages",pages);
                    request.setAttribute("classesList", list);
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
                            "           window.document.location.href=\'ClassesListServlet\';\n" +
                            "</script>" +
                            "</body>");
                }
                else {
                    ArrayList<Classes> list = new ArrayList<>();
                    currentPages++;
                    for(int i = currentPages * 10 - 10;i<currentPages*10 && i<classesList.size();i++){
                        list.add(classesList.get(i));
                    }
                    request.setAttribute("currentPages",currentPages);
                    request.setAttribute("pages",pages);
                    request.setAttribute("classesList", list);
                    request.getRequestDispatcher("list.jsp").forward(request, response);
                }
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
