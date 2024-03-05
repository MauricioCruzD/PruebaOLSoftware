package com.testTec.OLSoftware.inventory.repository;

/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.testTec.OLSoftware.inventory.model.Device;
import com.testTec.OLSoftware.inventory.model.DeviceState;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {
     // Consulta por número de inventario
    Device findByInventoryNumber(Integer inventoryNumber);

    // Consulta por estado del dispositivo
    List<Device> findByDeviceState(DeviceState deviceState);
}
