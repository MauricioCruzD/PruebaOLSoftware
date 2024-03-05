package com.testTec.OLSoftware.inventory.model;
/**
 *
 * @author macru
 */
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "device_types")
public class DeviceType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
