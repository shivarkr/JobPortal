package com.example.Jobportal.securityconfigs.service;


import com.example.Jobportal.securityconfigs.REPO.UserRepo;
import com.example.Jobportal.securityconfigs.entities.User;
import com.example.Jobportal.securityconfigs.entities.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUserName(username);
        if(user==null){
            System.out.println("user not found  404 ");
            throw  new UsernameNotFoundException("user not found 404 ");
        }
        return new UserPrincipal(user);
    }
}
