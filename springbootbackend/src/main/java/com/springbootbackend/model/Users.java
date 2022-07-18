package com.springbootbackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class Users {

    @Id
    @SequenceGenerator(
            name = "users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private Long user_id;

    @Column(name = "USR_NAME")
    private String usr_name;

    @Column(name = "USR_PASSWORD")
    private String usr_password;

    @Column(name = "USR_EMAIL")
    private String usr_email;

    @Column(name = "USR_CONTACT")
    private String usr_contact;

    @ManyToOne
    @JoinColumn(name = "COMP_ID", nullable = false)
    @JsonBackReference
    private Company company;

    @ManyToOne
    @JoinColumn(name = "ROLES_ID", nullable = false)
    @JsonBackReference
    private Roles roles;

    public Users() {

    }

    public Users(String usr_name, String usr_password, String usr_email, String usr_contact, Company company, Roles roles) {
        this.usr_name = usr_name;
        this.usr_password = usr_password;
        this.usr_email = usr_email;
        this.usr_contact = usr_contact;
        this.company = company;
        this.roles = roles;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        this.usr_name = usr_name;
    }

    public String getUsr_password() {
        return usr_password;
    }

    public void setUsr_password(String usr_password) {
        this.usr_password = usr_password;
    }

    public String getUsr_email() {
        return usr_email;
    }

    public void setUsr_email(String usr_email) {
        this.usr_email = usr_email;
    }

    public String getUsr_contact() {
        return usr_contact;
    }

    public void setUsr_contact(String usr_contact) {
        this.usr_contact = usr_contact;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
