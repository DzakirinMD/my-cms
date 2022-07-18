package com.springbootbackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNTS")
public class Accounts {

    @Id
    @SequenceGenerator(
            name = "accounts_sequence",
            sequenceName = "accounts_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =GenerationType.SEQUENCE,
            generator = "accounts_sequence"
    )
    private Long acct_id;

    @Column(name = "ACCT_NAME")
    private String acct_name;

    @Column(name = "ACCT_DESC")
    private String acct_desc;

    @Column(name = "ACCT_BALANCE")
    private double acct_balance;

    @Column(name = "ACCT_IS_INTERNATIONAL")
    private boolean acct_is_international;

    @ManyToOne
    @JoinColumn(name = "COMP_ID", nullable = false)
    @JsonBackReference
    private Company company;

    public Accounts() {

    }

    public Accounts(String acct_name, String acct_desc, double acct_balance, boolean acct_is_international, Company company) {
        this.acct_name = acct_name;
        this.acct_desc = acct_desc;
        this.acct_balance = acct_balance;
        this.acct_is_international = acct_is_international;
        this.company = company;
    }

    public Long getAcct_id() {
        return acct_id;
    }

    public void setAcct_id(Long acct_id) {
        this.acct_id = acct_id;
    }

    public String getAcct_name() {
        return acct_name;
    }

    public void setAcct_name(String acct_name) {
        this.acct_name = acct_name;
    }

    public String getAcct_desc() {
        return acct_desc;
    }

    public void setAcct_desc(String acct_desc) {
        this.acct_desc = acct_desc;
    }

    public double getAcct_balance() {
        return acct_balance;
    }

    public void setAcct_balance(double acct_balance) {
        this.acct_balance = acct_balance;
    }

    public boolean isAcct_is_international() {
        return acct_is_international;
    }

    public void setAcct_is_international(boolean acct_is_international) {
        this.acct_is_international = acct_is_international;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
