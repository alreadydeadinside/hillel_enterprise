package com.example.demo.services;

import java.util.List;

import com.example.demo.model.OldUser;
import com.example.demo.repository.AbstractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService<OldUser> {
    @Autowired
    @Qualifier("jpaRepositoryImpl")
    private final AbstractRepository<OldUser> repository;

    public UserServiceImpl() {
        repository = null;
    }

    @Override
    public void create(OldUser user) {
        repository.create(user);
    }

    @Override
    public List<OldUser> getAll() {
        return repository.getAll();
    }
}