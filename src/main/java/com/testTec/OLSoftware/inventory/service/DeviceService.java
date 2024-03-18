package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testTec.OLSoftware.inventory.repository.DeviceRepository;
import com.testTec.OLSoftware.inventory.model.Devices;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository repository; 

    public List<Devices> getAllDevices() {
        return repository.findAll();
    }

    public Devices getDeviceById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Devices createDevice(Devices device) {
        // Lógica de validación o procesamiento adicional si es necesario
        return repository.save(device);
    }

    public Devices updateDevice(Integer id, Devices device) {
        // Verificar si el dispositivo existe antes de actualizar
        if (repository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            device.setId(id); // Asegurando que el ID sea el mismo
            return repository.save(device);
        }
        return null; // Manejar el caso en el que el dispositivo no existe
    }

    public void deleteDevice(Integer id) {
        repository.deleteById(id);
    }
}
