package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Set;

@Service
public class UserSer {//implements UserDetailsService {
//    @Autowired
//    UserRepo userRepo;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//       // Users user = userRepo.getByName(username);
//        Set<GrantedAuthority> grantedAuthorities = Collections.singleton(new SimpleGrantedAuthority(user.getRole()));
//        return (UserDetails) new  Users(user.getUsername(), user.getPassword(), grantedAuthorities);
//    }
}
