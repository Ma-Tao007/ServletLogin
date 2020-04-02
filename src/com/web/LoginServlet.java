package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setHeader("content-type", "text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+"==="+password);

        try {
            //表单填写的都是字符串
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT",     "root", "123456");
            String     sql = "select * from sysuser where username=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            ResultSet re = preparedStatement.executeQuery();
            PrintWriter out = response.getWriter();
            Boolean flag = false;
            while(re.next()){
                flag = true;
                if(re.getString("password").equals(password)){
                    out.print("<h1>登陆成功</h1>");
                }else{
                    out.print("<h1>密码错误</h1>");
                }
            }
            if(!flag){
                out.print("<h1>用户名不存在</h1>");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进来get");
    }
}
