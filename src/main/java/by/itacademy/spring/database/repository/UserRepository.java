package by.itacademy.spring.database.repository;

import by.itacademy.spring.database.entity.Company;
import by.itacademy.spring.database.entity.User;
import by.itacademy.spring.database.pool.ConnectionPool;
import lombok.*;
import org.springframework.stereotype.Repository;


@Repository
@ToString
public class UserRepository {

    public UserRepository(ConnectionPool connectionPool2) {
    }

    public User save(User user) {
        return user;
    }
}
