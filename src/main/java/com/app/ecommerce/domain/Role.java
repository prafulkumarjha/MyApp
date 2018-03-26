package com.app.ecommerce.domain;

import javax.persistence.*;

/**
 * created by Praful Jha on 24/03/2018
 */

@Table(name="role")
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id")
    private long id;

    @Column(name="role")
    private String role;

    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
