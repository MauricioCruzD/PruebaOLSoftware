package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.AreaService;
import com.testTec.OLSoftware.inventory.model.Areas;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/areas")
public class AreaController {

    @Autowired
    private AreaService areaService;
   
    @GetMapping("/getAreas")
    public List<Areas> getAllAreas() {
        return areaService.getAllAreas();
    }

    @GetMapping("/getArea/{id}")
    public Areas getAreaById(@PathVariable Integer id) {
        return areaService.getAreaById(id);
    }

    @PostMapping("/createArea")
    public Areas createArea(@RequestBody Areas area) {
        return areaService.createArea(area);
    }

    @PutMapping("/updateArea/{id}")
    public Areas updateArea(@PathVariable Integer id, @RequestBody Areas area) {
        return areaService.updateArea(id, area);
    }

    @DeleteMapping("/deleteArea/{id}")
    public void deleteArea(@PathVariable Integer id) {
        areaService.deleteArea(id);
    }
}
