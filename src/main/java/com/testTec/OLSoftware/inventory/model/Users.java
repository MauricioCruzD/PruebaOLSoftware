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
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "type_id",referencedColumnName ="id")
    private TypesId typeId;
    
    @Column(name = "number_id", nullable = false, unique = true)
    private String numberId;
    
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    
    @Column(name = "second_name")
    private String secondName;

    @Column(name = "last_name", nullable = false)
    private String lastName;
    
    @Column(name = "last_name2")
    private String lastName2;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone")
    private String phone;

    //@Column(name = "role", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "role_id",referencedColumnName ="id")
    private Roles role;
    
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "area_id",referencedColumnName ="id")
    private Areas area;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="state_id",referencedColumnName ="id")
    private States state;
    
}
