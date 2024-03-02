package com.test.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.test.OLSoftware.inventory.service.AreaService;
import com.test.OLSoftware.inventory.model.Area;

import java.util.List;

@RestController
@RequestMapping("/api/areas")
public class AreaController {

    @Autowired
    private AreaService areaService; // Deberías tener un servicio para manejar la lógica de áreas

    @GetMapping
    public List<Area> getAllAreas() {
        return areaService.getAllAreas();
    }

    @GetMapping("/{id}")
    public Area getAreaById(@PathVariable Long id) {
        return areaService.getAreaById(id);
    }

    @PostMapping
    public Area createArea(@RequestBody Area area) {
        return areaService.createArea(area);
    }

    @PutMapping("/{id}")
    public Area updateArea(@PathVariable Long id, @RequestBody Area area) {
        return areaService.updateArea(id, area);
    }

    @DeleteMapping("/{id}")
    public void deleteArea(@PathVariable Long id) {
        areaService.deleteArea(id);
    }
}
