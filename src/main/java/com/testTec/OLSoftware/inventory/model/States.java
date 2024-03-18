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
}
