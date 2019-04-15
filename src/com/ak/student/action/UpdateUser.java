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
import java.util.function.DoubleBinaryOperator;

@WebServlet(name = "UpdateUser",value = "/manage/user/UpdateUser")
public class UpdateUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        UserDaoImpl udi = new UserDaoImpl();
        String username = (String)session.getAttribute("username");
        try {
            User user = udi.getOne(username);
            String password = request.getParameter("password");
            String password1 = request.getParameter("password1");
            String password2 = request.getParameter("password2");
            if(!udi.getOne(username).getPassword().equals(DbUtil.md5(password))){
                out.print("<html>" +
                        "<body>" +
                        "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                        "           alert(\'原密码错误！！！\');\n" +
                        "           window.document.location.href=\'update.jsp\';\n" +
                        "</script>" +
                        "</body>");
            }
            else {
                if(!password1.equals(password2)){
                    out.print("<html>" +
                            "<body>" +
                            "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                            "           alert(\'两次密码不一致！！！\');\n" +
                            "           window.document.location.href=\'update.jsp\';\n" +
                            "</script>" +
                            "</body>");
                }
                else {
                    if (!password.equals(password1)) {
                        System.out.println(password+" "+ DbUtil.md5(password1));
                        user.setPassword(DbUtil.md5(password1));
                        System.out.println(udi.update(user));
                        out.print("<html>" +
                                "<body>" +
                                "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                                "           alert(\'密码修改成功！！！\');\n" +
                                "           window.document.location.href=\'../logout.jsp\';\n" +
                                "</script>" +
                                "</body>");
                    }
                    else {
                        out.print("<html>" +
                                "<body>" +
                                "<script type=\'text/javascript\' language=\'javascript\'>\n" +
                                "           alert(\'新密码不能与原密码相同！！！\');\n" +
                                "           window.document.location.href=\'update.jsp\';\n" +
                                "</script>" +
                                "</body>");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
