package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.AreaService;
import com.testTec.OLSoftware.inventory.model.Area;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/areas")
public class AreaController {

    @Autowired
    private AreaService areaService;
   
    @GetMapping
    public List<Area> getAllAreas() {
        return areaService.getAllAreas();
    }

    @GetMapping("/{id}")
    public Area getAreaById(@PathVariable Integer id) {
        return areaService.getAreaById(id);
    }

    @PostMapping
    public Area createArea(@RequestBody Area area) {
        return areaService.createArea(area);
    }

    @PutMapping("/{id}")
    public Area updateArea(@PathVariable Integer id, @RequestBody Area area) {
        return areaService.updateArea(id, area);
    }

    @DeleteMapping("/{id}")
    public void deleteArea(@PathVariable Integer id) {
        areaService.deleteArea(id);
    }
}