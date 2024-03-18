package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */


import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.repository.AreaRepository;
import com.testTec.OLSoftware.inventory.model.Areas;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository; 
    
    public List<Areas> getAllAreas() {
        return areaRepository.findAll();
    }

    public Areas getAreaById(Integer id) {
        return areaRepository.findById(id).orElse(null);
    }

    public Areas createArea(Areas area) {
        // Lógica de validación o procesamiento adicional si es necesario
        return areaRepository.save(area);
    }

    public Areas updateArea(Integer id, Areas area) {
        // Verificar si el área existe antes de actualizar
        if (areaRepository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            area.setId(id); // Asegurando que el ID sea el mismo
            return areaRepository.save(area);
        }
        return null; // Manejar el caso en el que el área no existe
    }

    public void deleteArea(Integer id) {
        areaRepository.deleteById(id);
    }
}

