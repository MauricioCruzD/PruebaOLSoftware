package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.*;
import com.testTec.OLSoftware.inventory.service.UserService;
import com.testTec.OLSoftware.inventory.model.Users;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/getUsers")
    public List<Users> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/getUser/{id}")
    public Users getUserById(@PathVariable Integer id) {
        return service.getUserById(id);
    }

    @PostMapping("/createUser")
    public Users createUser(@RequestBody Users user) {
        return service.createUser(user);
    }

    @PutMapping("/updateUser/{id}")
    public Users updateUser(@PathVariable Integer id, @RequestBody Users user) {
        return service.updateUser(id, user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Integer id) {
        service.deleteUser(id);
    }
}
