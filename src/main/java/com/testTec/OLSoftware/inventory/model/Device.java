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

}
