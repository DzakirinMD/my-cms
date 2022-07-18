package com.springbootbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/")
public class AccountsController {

    @GetMapping("accounts")
    public String testAccountService() {
        return "Service is running";
    }
}
