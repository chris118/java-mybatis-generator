package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.UserMapperExt;
import com.example.demo.model.User;
import com.example.demo.model.UserExample;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapperExt userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User findByIdExt(Integer id) {
        return userMapper.selectExt(id);
    }

    @Override
    public List<User> findByPage(int currPage, int pageSize) {
        return userMapper.selectByExample(
                new UserExample()
                .createCriteria()
                .example()
                .page(currPage, pageSize)
        );
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int batchAddUsers(List<User> users) {
        return userMapper.batchInsert(users);
    }

}
