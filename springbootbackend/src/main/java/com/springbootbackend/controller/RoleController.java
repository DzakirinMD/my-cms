package com.springbootbackend.controller;

import com.springbootbackend.model.Roles;
import com.springbootbackend.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    // Get all Roles
    @GetMapping("/roles")
    public List<Roles> getAllAccounts() {
        return roleRepository.findAll();
    }
}
