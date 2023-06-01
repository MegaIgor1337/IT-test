package by.itacademy.spring.mapper;

import by.itacademy.spring.database.entity.User;
import by.itacademy.spring.dto.CreateUserDto;
import by.itacademy.spring.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserMapper {
    private final CreateUserDto createUserDto;
    ;
}
