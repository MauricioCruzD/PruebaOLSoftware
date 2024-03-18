package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testTec.OLSoftware.inventory.repository.UserRepository;
import com.testTec.OLSoftware.inventory.model.Users;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<Users> getAllUsers() {
        return repository.findAll();
    }

    public Users getUserById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public Users createUser(Users user) {
        // Lógica de validación o procesamiento adicional si es necesario
        return repository.save(user);
    }

    public Users updateUser(Integer id, Users user) {
        // Verificar si el usuario existe antes de actualizar
        if (repository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            user.setId(id); // Asegurando que el ID sea el mismo
            return repository.save(user);
        }
        return null; // Manejar el caso en el que el usuario no existe
    }

    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }
}
