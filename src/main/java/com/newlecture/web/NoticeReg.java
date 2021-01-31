package com.newlecture.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/notice-reg")
public class NoticeReg extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String title = req.getParameter("title");
        String content = req.getParameter("content");

        writer.println(title);
        writer.println(content);

    }
}
