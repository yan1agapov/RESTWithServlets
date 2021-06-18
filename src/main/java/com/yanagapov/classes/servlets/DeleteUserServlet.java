package com.yanagapov.classes.servlets;

import com.yanagapov.classes.DAO.UsersDAO;
import com.yanagapov.classes.DAO.UsersDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/delete_user"})
public class DeleteUserServlet extends HttpServlet {
    UsersDAO usersDAO = new UsersDAOImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        usersDAO.deleteUser(id);
        resp.sendRedirect(req.getContextPath() + "/users");
    }
}
