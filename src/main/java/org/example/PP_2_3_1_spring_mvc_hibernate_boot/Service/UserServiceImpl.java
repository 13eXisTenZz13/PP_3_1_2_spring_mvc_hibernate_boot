package org.example.PP_2_3_1_spring_mvc_hibernate_boot.Service;

import org.example.PP_2_3_1_spring_mvc_hibernate_boot.DAO.UserDao;
import org.example.PP_2_3_1_spring_mvc_hibernate_boot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Override
    public User showUser(Long id) {
        return userDao.showUser(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void delUser(Long id) {
        userDao.delUser(id);
    }
}