package com.testTec.OLSoftware.inventory.repository;
/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.testTec.OLSoftware.inventory.model.DeviceModels;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DeviceModelRepository extends JpaRepository<DeviceModels, Integer> {
 
    DeviceModels findByName(String name);
     
}


