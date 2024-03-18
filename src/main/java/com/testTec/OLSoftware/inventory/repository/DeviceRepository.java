package com.testTec.OLSoftware.inventory.repository;

/**
 *
 * @author macru
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.testTec.OLSoftware.inventory.model.Devices;
import com.testTec.OLSoftware.inventory.model.DeviceStates;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Devices, Integer> {
     // Consulta por número de inventario
    Devices findByInventoryNumber(Integer inventoryNumber);

    // Consulta por estado del dispositivo
    List<Devices> findByDeviceState(DeviceStates deviceState);
}
