package com.example.demo.repository.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.AbstractRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class JpaRepositoryImpl implements AbstractRespository {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<User> getAll() {
        TypedQuery<User> fromUser = entityManager.createQuery("from User", User.class);
        fromUser.setLockMode(LockModeType.WRITE);
        return fromUser.getResultList();
    }

    @Override
    public void create(User user) {

    }
}