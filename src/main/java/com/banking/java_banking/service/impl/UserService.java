package com.banking.java_banking.service.impl;

import com.banking.java_banking.dto.BankRespone;
import com.banking.java_banking.dto.UserRequest;
import org.springframework.stereotype.Service;


public interface UserService {
    BankRespone createAccount(UserRequest userRequest) ;

}
