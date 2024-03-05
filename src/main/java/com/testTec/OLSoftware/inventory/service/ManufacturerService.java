package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testTec.OLSoftware.inventory.repository.ManufacturerRepository;
import com.testTec.OLSoftware.inventory.model.Manufacturer;

import java.util.List;

@Service
public class ManufacturerService {

    @Autowired
    private ManufacturerRepository repository;

    public List<Manufacturer> getAllManufacturers() {
        return repository.findAll();
    }

    public Manufacturer getManufacturerById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Manufacturer createManufacturer(Manufacturer manufacturer) {
        // Lógica de validación o procesamiento adicional si es necesario
        return repository.save(manufacturer);
    }

    public Manufacturer updateManufacturer(Integer id, Manufacturer manufacturer) {
        // Verificar si el usuario existe antes de actualizar
        if (repository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            manufacturer.setId(id); // Asegurando que el ID sea el mismo
            return repository.save(manufacturer);
        }
        return null; // Manejar el caso en el que el usuario no existe
    }

    public void deleteManufacturer(Integer id) {
        repository.deleteById(id);
    }
}

