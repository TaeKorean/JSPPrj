package com.newlecture.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hi")
public class Nana extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        int cnt = 0;
        String cnt_ = req.getParameter("cnt");
        if (!cnt_.equals("") && cnt_ != null) {
            cnt = Integer.parseInt(cnt_);
        }

        for (int i=0; i<cnt; i++) {
            writer.println((i+1) + ": 안녕하세요!");
        }



    }
}
