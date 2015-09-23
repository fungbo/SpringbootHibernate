package com.tw.service;

import com.tw.dao.UserDao;
import com.tw.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User addUser(User user) {
        return userDao.save(user);
    }

    public List<User> listUsers() {
        return (List<User>) userDao.findAll();
    }
}
