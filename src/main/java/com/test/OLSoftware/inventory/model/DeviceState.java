package com.test.OLSoftware.inventory.model;

/**
 *
 * @author macru
 */
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "device_states")
public class DeviceState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String stateName;

    @OneToMany(mappedBy = "deviceState", cascade = CascadeType.ALL)
    private List<Device> devices;

    // Getters and setters
    
       public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
