package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDTO;

public interface AccountService {

    void createAccount(CustomerDTO customerDTO);

    CustomerDTO fetchAccountDetails(String mobileNumber);
}
