package com.example.Jobportal.securityconfigs.Controller;


import com.example.Jobportal.securityconfigs.REPO.UserRepo;
import com.example.Jobportal.securityconfigs.entities.User;
import com.example.Jobportal.securityconfigs.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    JwtService jwtService;
    @Autowired
    UserRepo u;
    @Autowired
    AuthenticationManager authenticationManager;
    @PostMapping("register")
    public void addUser(@RequestBody User user){
        user.setUserPassword(new BCryptPasswordEncoder(10).encode(user.getUserPassword()));
        u.save(user);
    }
    @PostMapping("login")
    public String login(@RequestBody User user){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(),user.getUserPassword()));
        if(authentication.isAuthenticated()){
            return jwtService.generateToken(user.getUserName());
        }else{
            return "Login failed";
        }
    }

}
