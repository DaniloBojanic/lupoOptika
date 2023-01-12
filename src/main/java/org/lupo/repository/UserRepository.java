package org.lupo.repository;

import org.lupo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneById(Long id);
    Optional<User> findFirstByUsername(String username);
    User findByEmail( String email );
    //List<User> findByAuthority(Authority authority);
}
