package com.example.javaeetest;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import logic.Cart;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Miron Krutoi";
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();

        String user = (String)session.getAttribute("current_user");

        if (user == null){

        }else{

        }




//        Cart cart = (Cart)session.getAttribute("cart");
//
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        if (cart==null){
//            cart = new Cart();
//
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }else{
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//        session.setAttribute("cart",cart);

        PrintWriter out = response.getWriter();

//        out.println("<html><body>");
//        out.println("<h1> Ur count is: " + count + "</h1");
//        out.println("<h1> Hi " + name +" " + surname + "</h1>");
//        out.println("</body></html>");
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);

    }

    public void destroy() {
    }
}