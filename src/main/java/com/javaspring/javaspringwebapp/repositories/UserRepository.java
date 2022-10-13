package com.javaspring.javaspringwebapp.repositories;

import com.javaspring.javaspringwebapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
