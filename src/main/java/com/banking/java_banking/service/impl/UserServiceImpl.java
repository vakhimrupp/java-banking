package com.banking.java_banking.service.impl;

import com.banking.java_banking.dto.BankRespone;
import com.banking.java_banking.dto.UserRequest;
import com.banking.java_banking.entity.User;

public class UserServiceImpl implements UserService {
    @Override
    public BankRespone createAccount(UserRequest userRequest) {
        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherNames(userRequest.getOtherNames())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber(userRequest.getAccountNumber())
                .build();
    }
}
