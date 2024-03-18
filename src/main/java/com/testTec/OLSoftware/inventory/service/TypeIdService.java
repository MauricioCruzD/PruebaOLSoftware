package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.repository.TypeIdRepository;
import com.testTec.OLSoftware.inventory.model.TypesId;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TypeIdService {
    
    @Autowired
    private TypeIdRepository typeIdRepository; 
    
    public List<TypesId> getAllTypesId() {
        return typeIdRepository.findAll();
    }

    public TypesId getTypeIdById(Integer id) {
        return typeIdRepository.findById(id).orElse(null);
    }

    public TypesId createTypeId(TypesId typeId) {
        // Lógica de validación o procesamiento adicional si es necesario
        return typeIdRepository.save(typeId);
    }

    public TypesId updateTypeId(Integer id, TypesId typeId) {
        // Verificar si el área existe antes de actualizar
        if (typeIdRepository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            typeId.setId(id); // Asegurando que el ID sea el mismo
            return typeIdRepository.save(typeId);
        }
        return null; // Manejar el caso en el que el área no existe
    }

    public void deleteTypeId(Integer id) {
        typeIdRepository.deleteById(id);
    }
    
}
