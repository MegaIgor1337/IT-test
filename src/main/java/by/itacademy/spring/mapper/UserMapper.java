package by.itacademy.spring.mapper;

import by.itacademy.spring.database.entity.User;
import by.itacademy.spring.dto.UserDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto mapFrom(User user) {
        return UserDto.builder()
                .id(user.getId())
                .build();
    }
}
