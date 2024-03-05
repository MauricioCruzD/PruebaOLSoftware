package com.testTec.OLSoftware.inventory.repository;

import com.testTec.OLSoftware.inventory.model.DeviceState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author macru
 */

@Repository
public interface DeviceStateRepository extends JpaRepository<DeviceState, Integer> {
 
    DeviceState findByName(String name);
     
}

