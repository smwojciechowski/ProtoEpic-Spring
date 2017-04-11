package com.slav.site;

import com.slav.site.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Iterable<User> getAllUsers() {

        return this.entityManager.createQuery(
                "SELECT u FROM User u ORDER BY u.username", User.class
        ).getResultList();
    }

    /*@Override
    public User get(long id) {

        return this.entityManager.createQuery(
                "SELECT u FROM User u WHERE u.id = :id", User.class
        ).setParameter("id", id).getSingleResult();
    }*/

    @Override
    public User get(User user) {

        return this.entityManager.createQuery(
                "SELECT u FROM User u WHERE u.username LIKE :username", User.class
        ).setParameter("username", user.getUsername()).getSingleResult();
    }

    @Override
    public void add(User user) {

        this.entityManager.persist(user);
    }

    @Override
    public void update(User user) {

        this.entityManager.merge(user);
    }

    @Override
    public void delete(User user) {

        this.entityManager.remove(user);
    }

    @Override
    public void delete(long id) {

        this.entityManager.createQuery(
                "DELETE FROM User u WHERE u.id = :id"
        ).setParameter("id", id).executeUpdate();
    }
}
