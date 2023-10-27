package com.example.xtracap.assgn.repository;


import com.example.xtracap.assgn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

