package com.testTec.OLSoftware.inventory.model;

/**
 *
 * @author macru
 */
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "devices")
public class Device implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "assigned_user_id")
    private User assignedUser;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private DeviceState deviceState;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private DeviceType type;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private DeviceModel model;

    @Column(name = "inventory_number", unique =true)
    private Integer inventoryNumber;

    @Column(name = "comments")
    private String comments;

    // Getters and setters
    
      public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(Integer inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public DeviceState getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(DeviceState deviceState) {
        this.deviceState = deviceState;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

}
