package com.springbootbackend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "COMPANY")
public class Company {

    @Id
    @SequenceGenerator(
            name = "company_sequence",
            sequenceName = "company_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "company_sequence"
    )
    private Long comp_id;

    @Column(name = "COMP_NAME")
    private String comp_name;

    @Column(name = "COMP_BRN")
    private String comp_brn;

    @Column(name = "COMP_ADDRESS")
    private String comp_address;

    @Column(name = "COMP_EMAIL")
    private String comp_email;

    @Column(name = "COMP_CONTACT")
    private String comp_contact;

    @OneToMany(mappedBy = "company")
    @JsonManagedReference
    private List<Accounts> accounts;

    @OneToMany(mappedBy = "company")
    @JsonManagedReference
    private List<Users> users;

    public Company() {

    }

    public Company(String comp_name, String comp_brn, String comp_address, String comp_email, String comp_contact) {
        this.comp_name = comp_name;
        this.comp_brn = comp_brn;
        this.comp_address = comp_address;
        this.comp_email = comp_email;
        this.comp_contact = comp_contact;
    }

    public Long getComp_id() {
        return comp_id;
    }

    public void setComp_id(Long comp_id) {
        this.comp_id = comp_id;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getComp_brn() {
        return comp_brn;
    }

    public void setComp_brn(String comp_brn) {
        this.comp_brn = comp_brn;
    }

    public String getComp_address() {
        return comp_address;
    }

    public void setComp_address(String comp_address) {
        this.comp_address = comp_address;
    }

    public String getComp_email() {
        return comp_email;
    }

    public void setComp_email(String comp_email) {
        this.comp_email = comp_email;
    }

    public String getComp_contact() {
        return comp_contact;
    }

    public void setComp_contact(String comp_contact) {
        this.comp_contact = comp_contact;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
