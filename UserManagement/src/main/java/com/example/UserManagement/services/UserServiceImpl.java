package com.example.UserManagement.services;

import com.example.UserManagement.dtos.requests.RegisterUserRequest;
import com.example.UserManagement.dtos.responses.RegisterUserResponse;
import com.example.UserManagement.models.User;
import com.example.UserManagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request) {
        if(isUserRegistered(request.getEmail())) {
            throw new RuntimeException("User with this email already exists");
        }
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        User savedUser = userRepository.save(user);
        RegisterUserResponse response = new RegisterUserResponse();
        response.setId(savedUser.getId());
        response.setEmail(savedUser.getEmail());
        return response;
    }

    private boolean isUserRegistered(String email) {
        return userRepository.existsUserByEmail(email);
    }
}
