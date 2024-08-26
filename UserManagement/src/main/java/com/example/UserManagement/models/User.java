package com.example.UserManagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "users")
@Entity
public class User {
    @Id
    private int id;
    private String email;
    private String password;
}
