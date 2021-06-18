package com.yanagapov.classes.DAO;

import com.yanagapov.classes.model.User;

import java.util.List;

public interface UsersDAO {
    List<User> getAll();
    void saveUser(User user);
    void deleteUser(int id);
}
