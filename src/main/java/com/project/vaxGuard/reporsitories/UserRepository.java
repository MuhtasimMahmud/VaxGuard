package com.project.vaxGuard.reporsitories;

import com.project.vaxGuard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findById(String id);
}
