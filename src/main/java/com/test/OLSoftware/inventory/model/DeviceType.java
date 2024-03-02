package com.test.OLSoftware.inventory.model;
/**
 *
 * @author macru
 */
import javax.persistence.*;

@Entity
@Table(name = "device_types")
public class DeviceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    // Getters and setters
}
