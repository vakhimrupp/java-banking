package com.banking.java_banking.service.impl;

import com.banking.java_banking.dto.AccountInfo;
import com.banking.java_banking.dto.BankRespone;
import com.banking.java_banking.dto.UserRequest;
import com.banking.java_banking.entity.User;
import com.banking.java_banking.repository.UserRepository;
import com.banking.java_banking.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public BankRespone createAccount(UserRequest userRequest) {

        /**
         * Creating an account - saving a new user to the database
         * Check if user with email already exists
         */
        if (userRepository.existsByEmail(userRequest.getEmail())) {
            return BankRespone.builder()
                    .responseCode(AccountUtils.ACCOUNT_EXISTS_CODE)
                    .responseMessage(AccountUtils.ACCOUNT_EXISTS_MESSAGE)
                    .accountInfo(null)
                    .build();
        }
        User newUser = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherNames(userRequest.getOtherNames())
                .gender(userRequest.getGender())
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber(AccountUtils.generateAccountNumber())
                .accountBalance(BigDecimal.ZERO)
                .email(userRequest.getEmail())
                .phoneNumber(userRequest.getPhoneNumber())
                .alternativePhoneNumber(userRequest.getAlternativePhoneNumber())
                .status("ACTIVE")
                .build();


        User savedUser = userRepository.save(newUser);
        return BankRespone.builder()
                .responseCode(AccountUtils.ACCOUNT_CREATION_SUCCESS)
                .responseMessage(AccountUtils.ACCOUNT_CREATION_MESSAGE)
                .accountInfo(AccountInfo.builder().build())
                .build();

    }
}
