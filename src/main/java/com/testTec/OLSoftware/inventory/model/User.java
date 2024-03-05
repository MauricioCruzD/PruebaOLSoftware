package com.testTec.OLSoftware.inventory.model;

/**
 *
 * @author macru
 */

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;
import lombok.Data;


@Entity
@Data
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone")
    private String phone;

    //@Column(name = "role", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "role")
    private Role role;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "area_id")
    private Area area;

    // Getters and setters

    @OneToMany(mappedBy = "assignedUser", cascade = CascadeType.ALL)
    private List<Device> devices;
    
}
