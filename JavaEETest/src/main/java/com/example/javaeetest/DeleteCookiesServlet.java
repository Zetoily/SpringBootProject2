package com.example.javaeetest;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class DeleteCookiesServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException{

    }
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
        Cookie cookie = new Cookie("some_id","");

        cookie.setMaxAge(0);

        response.addCookie(cookie);
    }

}
