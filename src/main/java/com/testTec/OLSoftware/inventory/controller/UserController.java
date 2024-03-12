package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.*;
import com.testTec.OLSoftware.inventory.service.UserService;
import com.testTec.OLSoftware.inventory.model.User;


import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@RequestMapping("/users")
@CrossOrigin
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class UserController {

    @Autowired
    private UserService service;
    
    @Autowired
    private PasswordEncoder bcrypt;

    @GetMapping("/getUsers")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable Integer id) {
        return service.getUserById(id);
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        user.setPassword(bcrypt.encode(user.getPassword()));
        return service.createUser(user);
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        return service.updateUser(id, user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Integer id) {
        service.deleteUser(id);
    }
}
