package com.ak.student.action;

import com.ak.student.dao.impl.UserDaoImpl;
import com.ak.student.entity.User;
import com.ak.student.util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet",value = "/manage/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        UserDaoImpl udi = new UserDaoImpl();
        String username = request.getParameter("username");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        if(!username.equals("") && !password1.equals("") && !password2.equals("")){
            try {
                if(!password1.equals(password2)){
                    out.print("<html>" +
                            "<body>" +
                            "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                            "           alert(\'两次密码不一致！！！\');\n" +
                            "           window.document.location.href=\'register.jsp\';\n" +
                            "</script>" +
                            "</body>");
                }
                else {
                    if(udi.getOne(username)!=null){
                        out.print("<html>" +
                                "<body>" +
                                "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                                "           alert(\'用户名已存在！！！\');\n" +
                                "           window.document.location.href=\'register.jsp\';\n" +
                                "</script>" +
                                "</body>");
                    }
                    else {
                        int user_sex = Integer.parseInt(request.getParameter("user_sex"));
                        System.out.println("**************************");
                        int user_age = Integer.parseInt(request.getParameter("user_age"));
                        User user = new User();
                        user.setUsername(username);
                        user.setPassword(DbUtil.md5(password1));
                        user.setUser_sex(user_sex);
                        user.setUser_age(user_age);
                        System.out.println(udi.insert(user));
                        out.print("<html>" +
                                "<body>" +
                                "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                                "           alert(\'注册成功！！！\');\n" +
                                "           window.document.location.href=\'../index.jsp\';\n" +
                                "</script>" +
                                "</body>");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            out.print("<html>" +
                    "<body>" +
                    "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                    "           alert(\'用户名或密码不能为空！！！\');\n" +
                    "           window.document.location.href=\'register.jsp\';\n" +
                    "</script>" +
                    "</body>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
