package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    User findByIdExt(Integer id);

    List<User> findByPage(int currPage, int pageSize);

    int addUser(User user);

    int batchAddUsers(List<User> users);
}
