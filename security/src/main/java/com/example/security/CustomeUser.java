package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class CustomeUser {//implements UserDetailsService {

//    @Autowired
//    UserRepo userRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        var customer=userRepo.getByName(username);
//        var uuu = User.withUsername(customer.getUsername())
//                .password(customer.getPassword())
//                .disabled(false)
//                .authorities("ADMIN").build();
//        return uuu;
//    }
}
