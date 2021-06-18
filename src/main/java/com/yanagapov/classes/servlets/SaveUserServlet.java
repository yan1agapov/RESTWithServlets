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

@WebServlet(urlPatterns = {"/save_user"})
public class SaveUserServlet extends HttpServlet {

    UsersDAO usersDAO = new UsersDAOImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id;
        if(req.getParameter("id").equals("")) {
            id = 0;
        } else {
            id = Integer.parseInt(req.getParameter("id"));
        }
        String firstName = req.getParameter("firstName");
        String secondName = req.getParameter("secondName");
        int age = Integer.parseInt(req.getParameter("age"));
        String email = req.getParameter("email");
        User user = new User(id, firstName, secondName, age, email);
        usersDAO.saveUser(user);
        resp.sendRedirect(req.getContextPath() + "/users");
    }
}
