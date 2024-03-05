package com.testTec.OLSoftware.inventory.repository;
/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.testTec.OLSoftware.inventory.model.DeviceModel;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DeviceModelRepository extends JpaRepository<DeviceModel, Integer> {
 
    DeviceModel findByName(String name);
     
}


