package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.repository.StateRepository;
import com.testTec.OLSoftware.inventory.model.States;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StateService {
    
    @Autowired
    private StateRepository stateRepository; 
    
    public List<States> getAllStates() {
        return stateRepository.findAll();
    }

    public States getStateById(String id) {
        return stateRepository.findById(id).orElse(null);
    }

    public States createState(States state) {
        // Lógica de validación o procesamiento adicional si es necesario
        return stateRepository.save(state);
    }

    public States updateState(String id, States state) {
        // Verificar si el área existe antes de actualizar
        if (stateRepository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            state.setId(id); // Asegurando que el ID sea el mismo
            return stateRepository.save(state);
        }
        return null; // Manejar el caso en el que el área no existe
    }

    public void deleteState(String id) {
        stateRepository.deleteById(id);
    }
    
}
