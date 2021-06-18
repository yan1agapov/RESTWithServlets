package com.yanagapov.classes.servlets;

import com.yanagapov.classes.DAO.UsersDAO;
import com.yanagapov.classes.DAO.UsersDAOImpl;
import com.yanagapov.classes.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/users"})
public class GetAllUsersServlet extends HttpServlet {

    UsersDAO usersDAO = new UsersDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = usersDAO.getAll();
        req.setAttribute("users", users);
        req.getRequestDispatcher("view/users.jsp").forward(req, resp);
    }
}
