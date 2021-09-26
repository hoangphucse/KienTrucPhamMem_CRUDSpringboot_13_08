package com.example.demo.service;


import com.example.demo.auth.Userprincipal;
import com.example.demo.entity.User;

public interface UserService {
	User createUser(User user);
    Userprincipal findByUsername(String username);
}
