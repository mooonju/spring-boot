package com.springboot.hello.controller;


import com.springboot.hello.dao.UserDao;
import com.springboot.hello.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping("/user")
    public String hello() {
        return "Hello World";
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id){
        userDao.deleteById(id);
    }

    @DeleteMapping("/user/all")
    public void deleteUserAll(){
        userDao.deleteAll();
    }

}
