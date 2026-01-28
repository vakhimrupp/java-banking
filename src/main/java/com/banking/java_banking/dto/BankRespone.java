package com.banking.java_banking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankRespone {
    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
