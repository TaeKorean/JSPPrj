package com.newlecture.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/add")
public class Add extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String num1_ = req.getParameter("num1");
        String num2_ = req.getParameter("num2");

        int num1 = 0;
        if (!num1_.equals("")) {
            num1 = Integer.parseInt(num1_);
        }

        int num2 = 0;
        if (!num2_.equals("")) {
            num2 = Integer.parseInt(num2_);
        }

        int result = num1 + num2;

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().printf("계산결과: %d\n", result);
    }
}
