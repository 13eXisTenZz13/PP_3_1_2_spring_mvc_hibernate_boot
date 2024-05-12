package org.example.PP_2_3_1_spring_mvc_hibernate_boot.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.PP_2_3_1_spring_mvc_hibernate_boot.models.User;

public interface UserDao extends JpaRepository<User, Long> {

}
