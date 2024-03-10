package com.creswave.test.repositories;

import com.creswave.test.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //find Users by email
    Optional<User> findByEmail(String email);
}
