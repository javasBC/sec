package com.example.security;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Users,Integer> {
//    @Query("select * from users where name =?0")
//    Users getByName(String name);
}
