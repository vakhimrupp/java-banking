package com.banking.java_banking.service;

import com.banking.java_banking.dto.BankResponse;
import com.banking.java_banking.dto.UserRequest;


public interface UserService {
    BankResponse createAccount(UserRequest userRequest) ;

}
