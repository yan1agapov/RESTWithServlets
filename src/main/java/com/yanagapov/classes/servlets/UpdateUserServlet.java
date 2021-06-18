package com.yanagapov.classes.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/update_user"})
public class UpdateUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("id", req.getParameter("id"));
        req.setAttribute("firstName", req.getParameter("firstName"));
        req.setAttribute("secondName", req.getParameter("secondName"));
        req.setAttribute("age", req.getParameter("age"));
        req.setAttribute("email", req.getParameter("email"));
        req.getRequestDispatcher("view/add_or_update_user.jsp").forward(req, resp);
    }
}
