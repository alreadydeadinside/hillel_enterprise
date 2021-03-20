package com.example.demo.services;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.repository.AbstractRepository;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService<User>{

    private final AbstractRepository<User> jdbcRepository;

    public UserServiceImpl(AbstractRepository<User> jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    @Override
    public void create(User user) {
        jdbcRepository.create(user);
    }

    @Override
    public List<User> getAll() {
        return jdbcRepository.getAll();
    }
}