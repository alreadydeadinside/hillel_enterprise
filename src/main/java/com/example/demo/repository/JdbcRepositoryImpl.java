package com.example.demo.repository;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

@Component
public class JdbcRepositoryImpl implements AbstractRepository<User> {

    private final RowMapper<User> ROW_MAPPER = (ResultSet resultSet, int rowNum) -> new User(resultSet.getInt("id"),
            resultSet.getString("firstName"), resultSet.getString("lastName"), resultSet.getString("email"),
            Role.valueOf(resultSet.getString("role")));

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> getAll() {
        return jdbcTemplate.query("SELECT * FROM user", ROW_MAPPER);
    }

    @Override
    public void create(User user) {
        jdbcTemplate.update("INSERT INTO user(firstName, lastName, email) VALUES (?, ?, ?)",
                user.getFirstName(),
                user.getLastName(),
                user.getEmail());
    }
}