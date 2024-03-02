package com.test.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.OLSoftware.inventory.repository.UserRepository;
import com.test.OLSoftware.inventory.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository; // Asumiendo que tienes un repositorio para User

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        // Lógica de validación o procesamiento adicional si es necesario
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user) {
        // Verificar si el usuario existe antes de actualizar
        if (userRepository.existsById(id)) {
            // Lógica de validación o procesamiento adicional si es necesario
            user.setId(id); // Asegurando que el ID sea el mismo
            return userRepository.save(user);
        }
        return null; // Manejar el caso en el que el usuario no existe
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
