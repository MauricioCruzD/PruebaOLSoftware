package com.test.OLSoftware.inventory.repository;

/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.OLSoftware.inventory.model.Device;
import com.test.OLSoftware.inventory.model.DeviceState;
import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, Long> {
     // Consulta por número de inventario
    Device findByInventoryNumber(String inventoryNumber);

    // Consulta por estado del dispositivo
    List<Device> findByDeviceState(DeviceState deviceState);
}
