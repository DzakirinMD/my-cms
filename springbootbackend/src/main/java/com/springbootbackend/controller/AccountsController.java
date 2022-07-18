package com.springbootbackend.controller;

import com.springbootbackend.model.Accounts;
import com.springbootbackend.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping("/test-accounts-service")
    public String testAccountService() {
        return "Service is running";
    }

    // Get all accounts
    @GetMapping("/accounts")
    public List<Accounts> getAllAccounts() {
        return accountsRepository.findAll();
    }
}
