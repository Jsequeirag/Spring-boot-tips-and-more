package com.example.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootcrud.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
    
}
