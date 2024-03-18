package com.testTec.OLSoftware.inventory.repository;

import com.testTec.OLSoftware.inventory.model.DeviceTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author macru
 */

@Repository
public interface DeviceTypeRepository extends JpaRepository<DeviceTypes, Integer> {
 
    DeviceTypes findByName(String name);
     
}

