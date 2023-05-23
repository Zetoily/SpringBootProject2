package com.example.javaeetest;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class SetCookiesServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException{

    }
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException{
        Cookie cookie1 = new Cookie("some_id","123");
        Cookie cookie2 = new Cookie("some_name","Miron");

        cookie1.setMaxAge(24*60*60);
        cookie2.setMaxAge(24*60*60);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

}
