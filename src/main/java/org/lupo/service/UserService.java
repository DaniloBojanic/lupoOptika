package org.lupo.service;

import org.lupo.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> findByUsername(String username);

    List<User> findAll();

    User findOne (Long id);

    User save(User user);

    void delete(Long id);
}
