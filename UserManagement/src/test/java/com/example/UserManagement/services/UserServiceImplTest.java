package com.example.UserManagement.services;

import com.example.UserManagement.dtos.requests.RegisterUserRequest;
import com.example.UserManagement.dtos.responses.RegisterUserResponse;
import com.example.UserManagement.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    public void registerUserTest(){
        RegisterUserRequest request = new RegisterUserRequest();
        request.setEmail("johndoe@example.com");
        request.setPassword("password123");
        RegisterUserResponse response = userService.registerUser(request);
        assertEquals("johndoe@example.com", response.getEmail());
        assertNotNull(response.getId());
    }

}