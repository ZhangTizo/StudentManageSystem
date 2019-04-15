package com.ak.student.action;

import com.ak.student.dao.impl.UserDaoImpl;
import com.ak.student.entity.User;
import com.ak.student.util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet",value = "/manage/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        UserDaoImpl udi = new UserDaoImpl();
        if(session.getAttribute("username")==null) {
            PrintWriter out = response.getWriter();
            String username = request.getParameter("username");
            String password = DbUtil.md5(request.getParameter("password"));
            if (!username.equals("") && !password.equals("")) {
                try {
                    if(udi.getOne(username)==null){
                        session.invalidate();
                        out.print("<html>" +
                                "<body>" +
                                "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                                "           alert(\'用户名不存在！！！\');\n" +
                                "           window.document.location.href=\'login.jsp\';\n" +
                                "</script>" +
                                "</body>");
                    }
                    else {
                        if (password.equals(udi.getOne(username).getPassword())) {
                            User user = udi.getOne(request.getParameter("username"));
                            if(request.getParameter("remember")!=null){
                                user.setMemo("1");
                                udi.update(user);
                            }
                            System.out.println("login success!!!");
                            session.setAttribute("username", username);
                            response.sendRedirect("success.jsp");
                        } else {
                            session.invalidate();
                            out.print("<html>" +
                                    "<body>" +
                                    "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                                    "           alert(\'密码错误！！！\');\n" +
                                    "           window.document.location.href=\'login.jsp\';\n" +
                                    "</script>" +
                                    "</body>");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else {
                session.invalidate();
                out.print("<html>" +
                        "<body>" +
                        "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                        "           alert(\'用户名或密码不能为空！！！\');\n" +
                        "           window.document.location.href=\'login.jsp\';\n" +
                        "</script>" +
                        "</body>");
            }
        }
        else {
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
