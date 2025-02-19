package com.example.Jobportal.securityconfigs.REPO;

import com.example.Jobportal.securityconfigs.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
    User findByUserName(String username);
}
