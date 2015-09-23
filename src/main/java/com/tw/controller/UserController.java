package com.tw.controller;

import com.tw.model.User;
import com.tw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        validate(user);
        return service.addUser(user);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<User> listUsers() {
        return service.listUsers();
    }

    private void validate(User user) {
        if (user.getMsisdn() == null) {
            throw new IllegalArgumentException("Msisdn should not be null");
        }
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleBadRequest() {
        return "Bad request";
    }
}
