package by.itacademy.spring.mapper;

import by.itacademy.spring.database.entity.User;
import by.itacademy.spring.dto.UserDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Component
public class UserDtoMapper {

    public User mapFrom(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .build();
    }
}
