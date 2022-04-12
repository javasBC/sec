package com.example.security;


import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Users {
    @Id
    private int id;
    @Column(name="username", nullable=false, unique=true)
    private String username;
    private String password;
    private String Role;

    public Users() {
    }

    public Users(String username, String password, Set<GrantedAuthority> grantedAuthorities) {
    }

    public Users(int id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        Role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
