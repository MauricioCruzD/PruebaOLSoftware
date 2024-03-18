package com.testTec.OLSoftware.inventory.service;

import com.testTec.OLSoftware.inventory.model.DeviceModels;
import com.testTec.OLSoftware.inventory.repository.DeviceModelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author macru
 */

@Service
public class DeviceModelService {

    @Autowired
    private DeviceModelRepository deviceModelRepository; 
    
    public List<DeviceModels> getAllDeviceModel() {
        return deviceModelRepository.findAll();
    }

    public DeviceModels getDeviceModelById(Integer id) {
        return deviceModelRepository.findById(id).orElse(null);
    }

    public DeviceModels createDeviceModel(DeviceModels deviceModel) {
        // Lógica de validación o procesamiento adicional si es necesario
        return deviceModelRepository.save(deviceModel);
    }

    public DeviceModels updateDeviceModel(Integer id, DeviceModels deviceModel) {
        // Verificar si el área existe antes de actualizar
        if (deviceModelRepository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            deviceModel.setId(id); // Asegurando que el ID sea el mismo
            return deviceModelRepository.save(deviceModel);
        }
        return null; // Manejar el caso en el que el área no existe
    }

    public void deleteDeviceModel(Integer id) {
        deviceModelRepository.deleteById(id);
    }
}
