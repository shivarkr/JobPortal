package com.example.Jobportal.securityconfigs.Controller;


import com.example.Jobportal.securityconfigs.REPO.UserRepo;
import com.example.Jobportal.securityconfigs.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepo u;
    @PostMapping("users")
    public void addUser(@RequestBody User user){
        user.setUserPassword(new BCryptPasswordEncoder(10).encode(user.getUserPassword()));
        u.save(user);
    }

}
