package com.example.demo.repository;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.AbstractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

@Component
public class JdbcRepositoryImpl implements AbstractRepository<User> {
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void create(User user) {

    }
}


