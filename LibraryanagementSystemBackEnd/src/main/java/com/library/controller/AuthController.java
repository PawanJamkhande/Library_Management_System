package com.library.controller;

import com.library.dto.ApiResponse;
import com.library.dto.LoginRequest;
import com.library.dto.RegisterRequest;
import com.library.service.UserService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")//cross origin request from angular frontend to spring boot backend, allowCredentials is used to allow cookies to be sent with the request
public class AuthController {
// Authcontroller is a controller class that handles the authentication requests from the client. 
// It has three endpoints: register, login and logout. It uses the UserService to perform the business logic.
    @Autowired
    private UserService userService;

    // Register User
    @PostMapping("/register")
    //PostMapping is used to map the HTTP POST requests onto specific handler methods. It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.POST).
    public ApiResponse registerUser(@Valid @RequestBody RegisterRequest request) {

        return userService.registerUser(request);
    }

    // Login User
    @PostMapping("/login")
    public ApiResponse loginUser(@Valid @RequestBody LoginRequest request) {

        return userService.loginUser(request);
    }

    // Logout User
    @PostMapping("/logout")
    public ApiResponse logoutUser() {

        return userService.logoutUser();
    }

}
