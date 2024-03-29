package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.RoleService;
import com.testTec.OLSoftware.inventory.model.Roles;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;
   
    @GetMapping("/getRoles")
    public List<Roles> getAllRole() {
        return roleService.getAllRole();
    }

    @GetMapping("/getRol/{id}")
    public Roles getRoleById(@PathVariable Integer id) {
        return roleService.getRoleById(id);
    }

    @PostMapping("/createRol")
    public Roles createRole(@RequestBody Roles role) {
        return roleService.createRole(role);
    }

    @PutMapping("/updateRol/{id}")
    public Roles updateRole(@PathVariable Integer id, @RequestBody Roles role) {
        return roleService.updateRole(id, role);
    }

    @DeleteMapping("/deleteRol/{id}")
    public void deleteRole(@PathVariable Integer id) {
        roleService.deleteRole(id);
    }
}

