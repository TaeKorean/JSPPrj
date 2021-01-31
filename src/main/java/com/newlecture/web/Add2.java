package com.newlecture.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/add2")
public class Add2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] num_ = req.getParameterValues("num");

        int result = 0;

        for (int i = 0; i < num_.length; i++) {
            int num = Integer.parseInt(num_[i]);
            result += num;
        }

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().printf("계산결과: %d\n", result);
    }
}
