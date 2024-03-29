package com.testTec.OLSoftware.inventory.model;

/**
 *
 * @author macru
 */
import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "devices")
public class Devices implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "assigned_user_id")
    private Users assignedUser;

    @ManyToOne
    @JoinColumn(name = "state_device_id")
    private DeviceStates deviceState;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private DeviceTypes type;
    
    @ManyToOne
    @JoinColumn(name = "model_id")
    private DeviceModels model;

    @Column(name = "inventory_number", unique =true)
    private Integer inventoryNumber;

    @Column(name = "comments")
    private String comments;
    
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="state_id",referencedColumnName ="id")
    private States state;

}
