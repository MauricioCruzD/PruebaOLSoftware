package com.test.OLSoftware.inventory.model;

/**
 *
 * @author macru
 */
import javax.persistence.*;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "assigned_user_id")
    private User assignedUser;

    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private DeviceState state;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private DeviceType type;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private DeviceModel model;

    @Column(name = "inventory_number")
    private String inventoryNumber;

    @Column(name = "comments")
    private String comments;

    // Getters and setters
    
      public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public DeviceState getDeviceState() {
        return state;
    }

    public void setDeviceState(DeviceState deviceState) {
        this.state = deviceState;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
}
