package com.springbootbackend.controller;

import com.springbootbackend.exception.ResourceNotFoundException;
import com.springbootbackend.model.Company;
import com.springbootbackend.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    // get all company
    @GetMapping("/company")
    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }

    // get company by id
    @GetMapping("/company/{id}")
    public ResponseEntity<Company> getAllCompany(@PathVariable Long id) {

        Company company = companyRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No Company with id : " + id));

        return ResponseEntity.ok(company);
    }
}
