package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.repository.AbstractRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class JpaRepositoryImpl implements AbstractRepository {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<User> getAll() {
        TypedQuery<User> fromUser = entityManager.createQuery("from User", User.class);
        fromUser.setLockMode(LockModeType.PESSIMISTIC_WRITE);
        return fromUser.getResultList();
    }

    @Override
    public void create(User user) {

    }
}