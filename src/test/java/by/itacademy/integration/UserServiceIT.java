package by.itacademy.integration;

import by.itacademy.annotation.IT;
import by.itacademy.spring.ApplicationRunner;
import by.itacademy.spring.database.entity.Company;
import by.itacademy.spring.database.entity.User;
import by.itacademy.spring.database.pool.ConnectionPool;
import by.itacademy.spring.database.repository.UserRepository;
import by.itacademy.spring.dto.UserDto;
import by.itacademy.spring.mapper.UserDtoMapper;
import by.itacademy.spring.mapper.UserMapper;
import by.itacademy.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@IT
@RequiredArgsConstructor
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ApplicationRunner.class)
public class UserServiceIT {
    private static final Long USER_ID = 1L;
    @Mock
    private  UserRepository userRepository;

    @Autowired
    private  UserService userService;


    @Test
    void testCreate() {
        Mockito.doReturn(new User(USER_ID)).when(userRepository).save(new User(USER_ID));
        var actualResult = userService.create(new UserDto(USER_ID));
        assertTrue(actualResult.isPresent());
        var expectedResult = new UserDto(USER_ID);
        actualResult.ifPresent(actual -> assertEquals(expectedResult, actual));
    }
}
