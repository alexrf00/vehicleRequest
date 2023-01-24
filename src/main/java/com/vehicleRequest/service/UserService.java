package com.vehicleRequest.service;

import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public interface UserService {
    public int loginValidation(String username, String password);
}
