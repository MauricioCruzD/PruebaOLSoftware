package com.testTec.OLSoftware.inventory.model;

/**
 *
 * @author macru
 */
import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name = "device_states")
public class DeviceStates implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;
    
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="state_id",referencedColumnName ="id")
    private States state;
}
