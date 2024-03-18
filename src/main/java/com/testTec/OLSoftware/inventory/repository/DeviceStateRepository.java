package com.testTec.OLSoftware.inventory.repository;

import com.testTec.OLSoftware.inventory.model.DeviceStates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author macru
 */

@Repository
public interface DeviceStateRepository extends JpaRepository<DeviceStates, Integer> {
 
    DeviceStates findByName(String name);
     
}

