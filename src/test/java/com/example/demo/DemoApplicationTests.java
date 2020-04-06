package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void insertUsers() {
        List<User> users = new ArrayList();
        for(int i = 0; i < 30; i++) {
            User user = User.builder()
                    .age(10)
                    .name("tom " + i)
                    .sex(0)
                    .userName("tom " + i)
                    .build();
            users.add(user);
        }

        userService.batchAddUsers(users);
    }

}
