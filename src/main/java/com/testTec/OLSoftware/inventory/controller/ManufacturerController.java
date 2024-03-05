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

@RestController
@RequestMapping("/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerService service;

    @GetMapping("/")
    public List<Manufacturer> getAllManufacturers() {
        return service.getAllManufacturers();
    }

    @GetMapping("/{id}")
    public Manufacturer getManufacturerById(@PathVariable Integer id) {
        return service.getManufacturerById(id);
    }

    @PostMapping
    public Manufacturer createManufacturer(@RequestBody Manufacturer manufacturer) {
        return service.createManufacturer(manufacturer);
    }

    @PutMapping("/{id}")
    public Manufacturer updateManufacturer(@PathVariable Integer id, @RequestBody Manufacturer manufacturer) {
        return service.updateManufacturer(id, manufacturer);
    }

    @DeleteMapping("/{id}")
    public void deleteManufacturer(@PathVariable Integer id) {
        service.deleteManufacturer(id);
    }
}
