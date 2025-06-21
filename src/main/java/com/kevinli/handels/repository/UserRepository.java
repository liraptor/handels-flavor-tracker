package com.kevinli.handels.repository;

import com.kevinli.handels.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    // You can add custom queries here later
}
