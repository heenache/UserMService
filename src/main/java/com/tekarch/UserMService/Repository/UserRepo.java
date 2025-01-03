package com.tekarch.UserMService.Repository;

import com.tekarch.UserMService.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
