package com.jwt.JWTExample.Service;

import com.jwt.JWTExample.Entity.User;
import com.jwt.JWTExample.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
  //load user from database
        User user= this.userRepository.findByEmail(username).orElseThrow(()->new RuntimeException("User " +
                "Not Found"));
        return user;
    }
}
