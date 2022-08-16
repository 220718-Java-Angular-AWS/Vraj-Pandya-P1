package com.revature.services;

import com.revature.daos.UserDAO;
import com.revature.pojos.User;

import java.util.List;

public class UserService {
    private UserDAO dao;

    public UserService() {
        this.dao = new UserDAO();

    }

    public void saveUser(User user) {
        dao.create(user);
    }

    public User getUser(int id) {
        return dao.read(id);
    }

    public List<User> getListUsers() {
        return dao.readAll();
    }

    public void updateUser(User user, Integer userId) {
        dao.update(user, userId);
    }

    public void deleteUser(int id) {
        dao.delete(id);
    }

    public User logIn(String credentials, String password) {
        return dao.logInUser(credentials, password);
    }
}