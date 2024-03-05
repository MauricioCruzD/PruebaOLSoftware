package com.testTec.OLSoftware.inventory.service;

import com.testTec.OLSoftware.inventory.model.DeviceState;
import com.testTec.OLSoftware.inventory.repository.DeviceStateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author macru
 */

@Service
public class DeviceStateService {

    @Autowired
    private DeviceStateRepository deviceStateRepository; 
    
    public List<DeviceState> getAllDeviceState() {
        return deviceStateRepository.findAll();
    }

    public DeviceState getDeviceStateById(Integer id) {
        return deviceStateRepository.findById(id).orElse(null);
    }

    public DeviceState createDeviceModel(DeviceState deviceState) {
        // Lógica de validación o procesamiento adicional si es necesario
        return deviceStateRepository.save(deviceState);
    }

    public DeviceState updateDeviceState(Integer id, DeviceState deviceState) {
        // Verificar si el área existe antes de actualizar
        if (deviceStateRepository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            deviceState.setId(id); // Asegurando que el ID sea el mismo
            return deviceStateRepository.save(deviceState);
        }
        return null; // Manejar el caso en el que el área no existe
    }

    public void deleteDeviceState(Integer id) {
        deviceStateRepository.deleteById(id);
    }
}
