package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testTec.OLSoftware.inventory.repository.ManufacturerRepository;
import com.testTec.OLSoftware.inventory.model.Manufacturers;

import java.util.List;

@Service
public class ManufacturerService {

    @Autowired
    private ManufacturerRepository repository;

    public List<Manufacturers> getAllManufacturers() {
        return repository.findAll();
    }

    public Manufacturers getManufacturerById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Manufacturers createManufacturer(Manufacturers manufacturer) {
        // Lógica de validación o procesamiento adicional si es necesario
        return repository.save(manufacturer);
    }

    public Manufacturers updateManufacturer(Integer id, Manufacturers manufacturer) {
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

