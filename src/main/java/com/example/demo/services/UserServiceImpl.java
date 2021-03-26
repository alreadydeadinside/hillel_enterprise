package com.example.demo.services;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.repository.AbstractRepository;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService<User> {
    @Autowired
    @Qualifier("jpaRepositoryImpl")
    private final AbstractRepository<User> repository;

    public UserServiceImpl() {
        repository = null;
    }

    @Override
    public void create(User user) {
        repository.create(user);
    }

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }
}