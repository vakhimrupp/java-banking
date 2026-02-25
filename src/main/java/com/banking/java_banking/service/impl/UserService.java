package com.banking.java_banking.service.impl;

import com.banking.java_banking.dto.BankRespone;
import com.banking.java_banking.dto.UserRequest;


public interface UserService {
    BankRespone createAccount(UserRequest userRequest) ;

}
