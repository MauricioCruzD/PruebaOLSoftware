package com.test.OLSoftware.inventory.model;

/**
 *
 * @author macru
 */
import javax.persistence.*;

@Entity
@Table(name = "device_models")
public class DeviceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    // Getters and setters
}
