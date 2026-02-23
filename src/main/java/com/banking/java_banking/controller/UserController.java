package com.banking.java_banking.controller;

import com.banking.java_banking.dto.BankRespone;
import com.banking.java_banking.dto.UserRequest;
import com.banking.java_banking.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public BankRespone createAccount(@RequestBody UserRequest userRequest) {
        return userService.createAccount(userRequest);
    }
}
