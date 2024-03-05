package com.testTec.OLSoftware.inventory.service;

import com.testTec.OLSoftware.inventory.model.DeviceModel;
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
    
    public List<DeviceModel> getAllDeviceModel() {
        return deviceModelRepository.findAll();
    }

    public DeviceModel getDeviceModelById(Integer id) {
        return deviceModelRepository.findById(id).orElse(null);
    }

    public DeviceModel createDeviceModel(DeviceModel deviceModel) {
        // Lógica de validación o procesamiento adicional si es necesario
        return deviceModelRepository.save(deviceModel);
    }

    public DeviceModel updateDeviceModel(Integer id, DeviceModel deviceModel) {
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
