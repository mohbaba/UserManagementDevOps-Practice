package com.example.UserManagement.services;

import com.example.UserManagement.dtos.requests.RegisterUserRequest;
import com.example.UserManagement.dtos.responses.RegisterUserResponse;

public interface UserService {
    RegisterUserResponse registerUser(RegisterUserRequest request);
}
