package org.example.student.repositry;

import org.example.student.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
