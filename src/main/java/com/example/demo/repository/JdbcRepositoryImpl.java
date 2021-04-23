package com.example.demo.repository;

import com.example.demo.model.OldUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JdbcRepositoryImpl implements AbstractRepository<OldUser> {
    @Override
    public List<OldUser> getAll() {
        return null;
    }

    @Override
    public void create(OldUser user) {

    }
}


