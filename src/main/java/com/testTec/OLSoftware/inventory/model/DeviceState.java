package com.testTec.OLSoftware.inventory.model;

/**
 *
 * @author macru
 */
import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "device_states")
public class DeviceState implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String stateName;

    @OneToMany(mappedBy = "deviceState", cascade = CascadeType.ALL)
    private List<Device> devices;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
