package com.example.demo.mapper;

import com.example.demo.model.User;

public interface UserMapperExt extends UserMapper{
    User selectExt(Integer id);
}
