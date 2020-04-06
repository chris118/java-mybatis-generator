package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable Integer id) {

        return userService.findById(id);
    }

    @RequestMapping("/users/ext/{id}")
    public User getUserExt(@PathVariable Integer id) {

        return userService.findByIdExt(id);
    }

    @RequestMapping("/users")
    public List<User> getUsersByPage(
            @RequestParam(value = "currPage") Integer currPage,
            @RequestParam(value = "pageSize") Integer pageSize) {
        return userService.findByPage(currPage, pageSize);
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public int addUser(@RequestBody User user) {

//        User.builder()
//                .age(10)
//                .name("tom")
//                .sex(0)
//                .userName("tom")
//                .build();

        return userService.addUser(user);
    }
}
