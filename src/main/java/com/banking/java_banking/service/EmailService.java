package com.banking.java_banking.service;

import com.banking.java_banking.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
