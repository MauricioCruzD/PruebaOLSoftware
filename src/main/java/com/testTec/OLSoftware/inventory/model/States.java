package com.testTec.OLSoftware.inventory.model;

/**
 *
 * @author macru
 */

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.Data;


@Entity
@Data
@Table(name = "states")

public class States implements Serializable{
    
    @Id
    @NotNull
    @Size(min=1, max=1)
    private String id;

    @Column(name = "name", nullable = false)
    @NotNull
    private String name;
    
//    @OneToMany(mappedBy="state", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//    private List<Areas> areas;
//    
//    @OneToMany(mappedBy="state", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//    private List<Users> users;
//    
//    @OneToMany(mappedBy="state", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//    private List<Roles> roles;
//    
//    @OneToMany(mappedBy="state", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//    private List<Devices> devices;
//    
//    @OneToMany(mappedBy="state", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//    private List<Manufacturers> manufacturer;
//    
//    @OneToMany(mappedBy="state", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//    private List<DeviceModels> deviceModel;
//    
//    @OneToMany(mappedBy="state", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//    private List<DeviceTypes> deviceType;
//    
//    @OneToMany(mappedBy="state", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//    private List<DeviceStates> deviceState;
//    
//    @OneToMany(mappedBy="state", cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
//    private List<TypesId> typeId;
//   
}
