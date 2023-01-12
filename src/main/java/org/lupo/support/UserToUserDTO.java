package org.lupo.support;
import org.lupo.model.User;
import org.lupo.web.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserToUserDTO implements Converter<User, UserDTO> {

    @Autowired
    private ProductToProductDTO toProductDto;
    @Override
    public UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setLastPasswordResetDate(user.getLastPasswordResetDate());
        userDTO.setProductDTOs(toProductDto.convertList(user.getProducts()));

        return userDTO;
    }

    public List<UserDTO> convert (List<User> users) {
        List<UserDTO> userDTOs = new ArrayList<>();

        for (User user: users) {
            userDTOs.add(convert(user));
        }

        return userDTOs;

    }
}
