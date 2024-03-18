package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */
import com.testTec.OLSoftware.inventory.model.DeviceTypes;
import com.testTec.OLSoftware.inventory.repository.DeviceTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeviceTypeService {

    @Autowired
    private DeviceTypeRepository deviceTypeRepository; 
    
    public List<DeviceTypes> getAllDeviceType() {
        return deviceTypeRepository.findAll();
    }

    public DeviceTypes getDeviceTypeById(Integer id) {
        return deviceTypeRepository.findById(id).orElse(null);
    }

    public DeviceTypes createDeviceType(DeviceTypes deviceType) {
        // Lógica de validación o procesamiento adicional si es necesario
        return deviceTypeRepository.save(deviceType);
    }

    public DeviceTypes updateDeviceType(Integer id, DeviceTypes deviceType) {
        // Verificar si el área existe antes de actualizar
        if (deviceTypeRepository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            deviceType.setId(id); // Asegurando que el ID sea el mismo
            return deviceTypeRepository.save(deviceType);
        }
        return null; // Manejar el caso en el que el área no existe
    }

    public void deleteDeviceType(Integer id) {
        deviceTypeRepository.deleteById(id);
    }
}
