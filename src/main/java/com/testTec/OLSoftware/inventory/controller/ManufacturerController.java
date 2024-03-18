package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.*;
import com.testTec.OLSoftware.inventory.service.ManufacturerService;
import com.testTec.OLSoftware.inventory.model.Manufacturers;


import java.util.List;

@RestController
@RequestMapping("/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerService service;

    @GetMapping("/getManufacturers")
    public List<Manufacturers> getAllManufacturers() {
        return service.getAllManufacturers();
    }

    @GetMapping("/getManufacturer/{id}")
    public Manufacturers getManufacturerById(@PathVariable Integer id) {
        return service.getManufacturerById(id);
    }

    @PostMapping("/createManufacturer")
    public Manufacturers createManufacturer(@RequestBody Manufacturers manufacturer) {
        return service.createManufacturer(manufacturer);
    }

    @PutMapping("/updateManufacturer/{id}")
    public Manufacturers updateManufacturer(@PathVariable Integer id, @RequestBody Manufacturers manufacturer) {
        return service.updateManufacturer(id, manufacturer);
    }

    @DeleteMapping("/deleteManufacturer/{id}")
    public void deleteManufacturer(@PathVariable Integer id) {
        service.deleteManufacturer(id);
    }
}
