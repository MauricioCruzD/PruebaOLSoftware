package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */
import com.testTec.OLSoftware.inventory.model.Role;
import com.testTec.OLSoftware.inventory.repository.RoleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository; 
    
    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Integer id) {
        return roleRepository.findById(id).orElse(null);
    }

    public Role createRole(Role role) {
        // Lógica de validación o procesamiento adicional si es necesario
        return roleRepository.save(role);
    }

    public Role updateRole(Integer id, Role role) {
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
