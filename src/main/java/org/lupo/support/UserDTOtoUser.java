package org.lupo.support;

import org.lupo.model.User;
import org.lupo.web.dto.UserDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
@Component
public class UserDTOtoUser implements Converter<UserDTO, User>{

    @Override
    public User convert(UserDTO userDto) {
        User user = new User();

        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setLastPasswordResetDate(userDto.getLastPasswordResetDate());
        user.setFirstLogin(userDto.isFirstLogin());


        return user;
    }
}
