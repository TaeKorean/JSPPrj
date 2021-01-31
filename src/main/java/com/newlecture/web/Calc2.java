package com.newlecture.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/calc2")
public class Calc2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        ServletContext servletContext = req.getServletContext();
        HttpSession session = req.getSession();
        String num_ = req.getParameter("num");
        String op = req.getParameter("op");

        int num = 0;
        if (!num_.equals("")) {
            num = Integer.parseInt(num_);
        }

        if (op.equals("=")) {
            int result = 0;
//            int x = (int) servletContext.getAttribute("num");
            int x = (int) session.getAttribute("num");
            int y = num;
//            String operator = (String) servletContext.getAttribute("op");
            String operator = (String) session.getAttribute("op");
            if (operator.equals("+")) {
                result = x + y;
            } else {
                result = x - y;
            }
            resp.getWriter().printf("result is: %d", result);

        } else {
//            servletContext.setAttribute("num", num);
//            servletContext.setAttribute("op", op);
            session.setAttribute("num", num);
            session.setAttribute("op", op);
        }

    }
}

