package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.*;
import com.testTec.OLSoftware.inventory.service.ManufacturerService;
import com.testTec.OLSoftware.inventory.model.Manufacturer;


import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/manufacturers")
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class ManufacturerController {

    @Autowired
    private ManufacturerService service;

    @GetMapping("/getManufacturers")
    public List<Manufacturer> getAllManufacturers() {
        return service.getAllManufacturers();
    }

    @GetMapping("/getManufacturer/{id}")
    public Manufacturer getManufacturerById(@PathVariable Integer id) {
        return service.getManufacturerById(id);
    }

    @PostMapping("/createManufacturer")
    public Manufacturer createManufacturer(@RequestBody Manufacturer manufacturer) {
        return service.createManufacturer(manufacturer);
    }

    @PutMapping("/updateManufacturer/{id}")
    public Manufacturer updateManufacturer(@PathVariable Integer id, @RequestBody Manufacturer manufacturer) {
        return service.updateManufacturer(id, manufacturer);
    }

    @DeleteMapping("/deleteManufacturer/{id}")
    public void deleteManufacturer(@PathVariable Integer id) {
        service.deleteManufacturer(id);
    }
}
