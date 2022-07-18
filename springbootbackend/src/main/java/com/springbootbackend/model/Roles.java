package com.springbootbackend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ROLES")
public class Roles {

    @Id
    @SequenceGenerator(
            name = "role_sequence",
            sequenceName = "role_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "role_sequence"
    )
    private Long roles_id;

    @Column(name = "ROLES_NAME")
    private String roles_name;

    @Column(name = "ROLES_DESC")
    private String roles_desc;

    @OneToMany(mappedBy = "roles")
    @JsonManagedReference
    private List<Users> users;

    public Roles() {
    }

    public Roles(String roles_name, String role_desc) {
        this.roles_name = roles_name;
        this.roles_desc = role_desc;
    }

    public Long getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(Long roles_id) {
        this.roles_id = roles_id;
    }

    public String getRoles_name() {
        return roles_name;
    }

    public void setRoles_name(String roles_name) {
        this.roles_name = roles_name;
    }

    public String getRoles_desc() {
        return roles_desc;
    }

    public void setRoles_desc(String roles_desc) {
        this.roles_desc = roles_desc;
    }
}