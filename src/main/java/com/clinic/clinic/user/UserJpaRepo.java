package com.clinic.clinic.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserJpaRepo extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
