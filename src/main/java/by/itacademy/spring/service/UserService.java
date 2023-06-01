package by.itacademy.spring.service;

import by.itacademy.spring.database.repository.UserRepository;
import by.itacademy.spring.dto.UserDto;
import by.itacademy.spring.mapper.CreateUserMapper;
import by.itacademy.spring.mapper.UserDtoMapper;
import by.itacademy.spring.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UserDtoMapper userDtoMapper;
    public Optional<UserDto> create(UserDto userDto) {
        if (userDto == null) {
            throw new RuntimeException("userDto is null");
        }
        var user = userDtoMapper.mapFrom(userDto);
        return Optional.of(userMapper.mapFrom(userRepository.save(user)));
    }
}
