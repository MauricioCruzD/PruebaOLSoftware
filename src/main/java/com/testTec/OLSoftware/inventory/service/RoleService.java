package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */
import com.testTec.OLSoftware.inventory.model.Roles;
import com.testTec.OLSoftware.inventory.repository.RoleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository; 
    
    public List<Roles> getAllRole() {
        return roleRepository.findAll();
    }

    public Roles getRoleById(Integer id) {
        return roleRepository.findById(id).orElse(null);
    }

    public Roles createRole(Roles role) {
        // Lógica de validación o procesamiento adicional si es necesario
        return roleRepository.save(role);
    }

    public Roles updateRole(Integer id, Roles role) {
        // Verificar si el área existe antes de actualizar
        if (roleRepository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            role.setId(id); // Asegurando que el ID sea el mismo
            return roleRepository.save(role);
        }
        return null; // Manejar el caso en el que el área no existe
    }

    public void deleteRole(Integer id) {
        roleRepository.deleteById(id);
    }
}
