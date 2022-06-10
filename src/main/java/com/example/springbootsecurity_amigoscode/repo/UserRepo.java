package com.example.springbootsecurity_amigoscode.repo;

import com.example.springbootsecurity_amigoscode.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
