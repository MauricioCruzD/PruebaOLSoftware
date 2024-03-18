package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.StateService;
import com.testTec.OLSoftware.inventory.model.States;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/states")

public class StateController {
    
    @Autowired
    private StateService stateService;
   
    @GetMapping("/getStates")
    public List<States> getAllStates() {
        return stateService.getAllStates();
    }

    @GetMapping("/getState/{id}")
    public States getStateById(@PathVariable String id) {
        return stateService.getStateById(id);
    }

    @PostMapping("/createState")
    public States createState(@Valid @RequestBody States state) {
        return stateService.createState(state);
    }

    @PutMapping("/updateState/{id}")
    public States updateState(@PathVariable String id, @RequestBody States state) {
        return stateService.updateState(id, state);
    }

    @DeleteMapping("/deleteState/{id}")
    public void deleteState(@PathVariable String id) {
        stateService.deleteState(id);
    }
}
