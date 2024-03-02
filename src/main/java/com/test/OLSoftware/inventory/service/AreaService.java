package com.test.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.OLSoftware.inventory.repository.AreaRepository;
import com.test.OLSoftware.inventory.model.Area;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository; // Asumiendo que tienes un repositorio para Area

    public List<Area> getAllAreas() {
        return areaRepository.findAll();
    }

    public Area getAreaById(Long id) {
        return areaRepository.findById(id).orElse(null);
    }

    public Area createArea(Area area) {
        // Lógica de validación o procesamiento adicional si es necesario
        return areaRepository.save(area);
    }

    public Area updateArea(Long id, Area area) {
        // Verificar si el área existe antes de actualizar
        if (areaRepository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            area.setId(id); // Asegurando que el ID sea el mismo
            return areaRepository.save(area);
        }
        return null; // Manejar el caso en el que el área no existe
    }

    public void deleteArea(Long id) {
        areaRepository.deleteById(id);
    }
}

