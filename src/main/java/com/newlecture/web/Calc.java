package com.newlecture.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calc")
public class Calc extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String num1_ = req.getParameter("num1");
        String num2_ = req.getParameter("num2");
        String op = req.getParameter("op");

        int num1 = 0;
        if (!num1_.equals("")) {
            num1 = Integer.parseInt(num1_);
        }

        int num2 = 0;
        if (!num2_.equals("")) {
            num2 = Integer.parseInt(num2_);
        }

        int result = 0;
        if (op.equals("add")) {
            result = num1 + num2;
        } else if (op.equals("sub")) {
            result = num1 - num2;
        }

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().printf("계산결과: %d\n", result);

    }
}

