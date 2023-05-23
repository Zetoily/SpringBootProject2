package com.example.javaeetest;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException{

    }
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        for (Cookie cookie: cookies) {
            pw.println("<h1>" + cookie.getName()+" : " + cookie.getValue() + "</h1>");
        }
        pw.println("</html>");
    }

}
