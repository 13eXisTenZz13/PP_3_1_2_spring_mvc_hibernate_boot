package org.example.PP_2_3_1_spring_mvc_hibernate_boot.DAO;

import org.example.PP_2_3_1_spring_mvc_hibernate_boot.models.User;

import java.util.List;

public interface UserDao {

    List<User> allUsers();
    User showUser(Long id);
    void saveUser(User user);
    void delUser(Long id);

}
