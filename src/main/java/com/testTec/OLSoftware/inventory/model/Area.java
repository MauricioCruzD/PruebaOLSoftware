package com.testTec.OLSoftware.inventory.model;


/**
 *
 * @author macru
 */
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name = "areas")
public class Area implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;
    
    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private List<User> users;
    
}

