package com.example.Usuarios.service;

import com.example.Usuarios.entity.User;

public interface UserService {
    User register(User user);
    User authenticate(String email, String password);
}
