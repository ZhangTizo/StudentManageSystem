<%@ page import="com.ak.student.dao.impl.UserDaoImpl" %>
<%@ page import="com.ak.student.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        UserDaoImpl udi = new UserDaoImpl();
        try {
            if(udi.getOne((String) session.getAttribute("username")).getMemo().equals("1")){
                request.setAttribute("user",session.getAttribute("username"));
                User user = udi.getOne((String) session.getAttribute("username"));
                user.setMemo("");
                udi.update(user);
                session.invalidate();
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.invalidate();
        response.sendRedirect("login.jsp");
    %>
</body>
</html>
