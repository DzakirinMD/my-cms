package com.springbootbackend.configuration;

import com.springbootbackend.model.Accounts;
import com.springbootbackend.model.Company;
import com.springbootbackend.model.Roles;
import com.springbootbackend.model.Users;
import com.springbootbackend.repository.AccountsRepository;
import com.springbootbackend.repository.CompanyRepository;
import com.springbootbackend.repository.RoleRepository;
import com.springbootbackend.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CompanyConfig {

    @Bean
    CommandLineRunner commandLineRunner(CompanyRepository companyRepository,
                                        AccountsRepository accountsRepository,
                                        RoleRepository roleRepository,
                                        UsersRepository usersRepository){
        return args -> {

            Company company1 = new Company(
                    "Rasa Enterprise",
                    "000001",
                    "Klang,Selangor",
                    "reklang@gmail.com",
                    "0124567733"
            );

            Company company2 = new Company(
                    "Lorri Enterprise",
                    "000002",
                    "Seberang Prai,Penang",
                    "LorriE@gmail.com",
                    "0124567523"
            );

            Roles roles1 = new Roles(
                    "User",
                    "Daily User");

            Roles roles2 = new Roles(
                    "Admin",
                    "Admin of the company");

            Accounts accounts1 = new Accounts(
                    "Nujum Pak Belalang",
                    "CA account",
                    100.00,
                    false,
                    company1
            );

            Accounts accounts2 = new Accounts(
                    "Ali Setan",
                    "SA account",
                    230.00,
                    true,
                    company2
            );

            Accounts accounts3 = new Accounts(
                    "Pak Abu",
                    "SA account",
                    50.00,
                    true,
                    company2
            );

            Users users1 = new Users(
                    "John",
                    "tempPass",
                    "Jhon@gmail.com",
                    "0123456789",
                    company1,
                    roles1
            );

            Users users2 = new Users(
                    "Doe",
                    "tempPass",
                    "Doeg@gmail.com",
                    "0123457254",
                    company1,
                    roles2
            );

            Users users3 = new Users(
                    "Vesta Nub",
                    "tempPass",
                    "VNub@gmail.com",
                    "7824456789",
                    company2,
                    roles1
            );

            Users users4 = new Users(
                    "Viparo lexi",
                    "tempPass",
                    "lexiVip@gmail.com",
                    "0125402789",
                    company2,
                    roles2
            );

            companyRepository.saveAll(List.of(company1, company2));
            roleRepository.saveAll(List.of(roles1, roles2));
            accountsRepository.saveAll(List.of(accounts1, accounts2, accounts3));
            usersRepository.saveAll(List.of(users1, users2, users3, users4));

        };
    }
}
