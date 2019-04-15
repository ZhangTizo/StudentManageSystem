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
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "SearchGradeServlet",value = "/manage/grade/SearchGradeServlet")
public class SearchGradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String s_no = request.getParameter("s_no");
        String c_no = request.getParameter("c_no");
        GradeDaoImpl gdi = new GradeDaoImpl();
        StudentDaoImpl sdi = new StudentDaoImpl();
        ClassesDaoImpl cdi = new ClassesDaoImpl();
        PrintWriter out = response.getWriter();
        if(request.getParameter("page")!=null){
            if(request.getParameter("page").equals("")){
                out.print("<html>" +
                        "<body>" +
                        "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                        "           alert(\'页号不能为空！！！\');\n" +
                        "           window.document.location.href=\'GradeListServlet\';\n" +
                        "</script>" +
                        "</body>");
            }
            else {
                ArrayList<Grades> gradeList = null;
                try {
                    gradeList = Grades.getGradeList(gdi.getList());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                int pages = gradeList.size()/10+1;
                int page = Integer.parseInt(request.getParameter("page"));
                if(page>gradeList.size()/10+1 || page<1){
                    out.print("<html>" +
                            "<body>" +
                            "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                            "           alert(\'该页面不存在！！！\');\n" +
                            "           window.document.location.href=\'GradeListServlet\';\n" +
                            "</script>" +
                            "</body>"+ "</html>");
                }
                ArrayList<Grades> list = new ArrayList<>();
                for(int i = page * 10 - 10;i<page*10 && i<gradeList.size();i++){
                    list.add(gradeList.get(i));
                }
                request.setAttribute("currentPages",page);
                request.setAttribute("pages",pages);
                request.setAttribute("gradeList", list);
                request.getRequestDispatcher("list.jsp").forward(request, response);
            }
        }
        if(!s_no.equals("") || !c_no.equals("")){
            ArrayList<Grades> gradeList = null;
            try {
                gradeList = Grades.getGradeList(gdi.getList(s_no,c_no));
            } catch (Exception e) {
                e.printStackTrace();
            }
            request.setAttribute("gradeList",gradeList);
            request.getRequestDispatcher("list.jsp").forward(request,response);
        }
        else if(s_no.equals("") && c_no.equals("")){
            response.sendRedirect("GradeListServlet");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
