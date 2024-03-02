package com.test.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.OLSoftware.inventory.repository.DeviceRepository;
import com.test.OLSoftware.inventory.model.Device;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository; // Asumiendo que tienes un repositorio para Device

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public Device getDeviceById(Long id) {
        return deviceRepository.findById(id).orElse(null);
    }

    public Device createDevice(Device device) {
        // Lógica de validación o procesamiento adicional si es necesario
        return deviceRepository.save(device);
    }

    public Device updateDevice(Long id, Device device) {
        // Verificar si el dispositivo existe antes de actualizar
        if (deviceRepository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            device.setId(id); // Asegurando que el ID sea el mismo
            return deviceRepository.save(device);
        }
        return null; // Manejar el caso en el que el dispositivo no existe
    }

    public void deleteDevice(Long id) {
        deviceRepository.deleteById(id);
    }
}
