package com.example.springbootsecurity_amigoscode.repo;

import com.example.springbootsecurity_amigoscode.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
