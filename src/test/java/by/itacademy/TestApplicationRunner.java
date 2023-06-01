package by.itacademy;

import by.itacademy.spring.database.pool.ConnectionPool;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;

@TestConfiguration
public class TestApplicationRunner {
    @MockBean(name = "connectionPool2")
    private ConnectionPool connectionPool;

}
