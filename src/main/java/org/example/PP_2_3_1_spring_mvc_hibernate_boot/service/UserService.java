package org.example.PP_2_3_1_spring_mvc_hibernate_boot.service;

import org.example.PP_2_3_1_spring_mvc_hibernate_boot.models.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    User showUser(long id);

    void saveUser(User user);

    void delUser(long id);
}
