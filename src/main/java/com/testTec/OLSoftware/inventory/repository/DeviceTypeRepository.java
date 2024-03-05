package com.testTec.OLSoftware.inventory.repository;

import com.testTec.OLSoftware.inventory.model.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author macru
 */

@Repository
public interface DeviceTypeRepository extends JpaRepository<DeviceType, Integer> {
 
    DeviceType findByName(String name);
     
}

