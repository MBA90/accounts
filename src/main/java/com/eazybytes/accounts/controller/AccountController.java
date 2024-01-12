package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.constants.AccountsConstants;
import com.eazybytes.accounts.dto.CustomerDTO;
import com.eazybytes.accounts.dto.ResponseDTO;
import com.eazybytes.accounts.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO) {

        accountService.createAccount(customerDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDTO(AccountsConstants.MESSAGE_201, AccountsConstants.MESSAGE_201));
    }

//    @GetMapping("/fetch")
//    public ResponseEntity<CustomerDTO> fetchAccountDetails(@RequestParam String mobileNumber) {
//        CustomerDTO customerDTO  =accountService.fetchAccountDetails(mobileNumber);
//        return ResponseEntity.status(HttpStatus.OK).body(customerDTO);
//
//    } 
}
