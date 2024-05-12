package org.example.PP_2_3_1_spring_mvc_hibernate_boot.DAO;

import org.example.PP_2_3_1_spring_mvc_hibernate_boot.models.User;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> allUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
    @Override
    public User showUser(long id) {
        return entityManager.find(User.class,id);
    }
    @Override
    public void saveUser(User user) {
        if(user.getId() != 0) {
            entityManager.merge(user);
        } else {
            entityManager.persist(user);
        }
        entityManager.flush();
    }
    @Override
    public void delUser(long id) {
        entityManager.remove(showUser(id));
        entityManager.flush();
    }

}