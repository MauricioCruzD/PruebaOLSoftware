package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.DeviceStateService;
import com.testTec.OLSoftware.inventory.model.DeviceState;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/devicemodel")
public class DeviceStateController {

    @Autowired
    private DeviceStateService deviceStateService;
   
    @GetMapping
    public List<DeviceState> getAllDeviceState() {
        return deviceStateService.getAllDeviceState();
    }

    @GetMapping("/{id}")
    public DeviceState getDeviceStateById(@PathVariable Integer id) {
        return deviceStateService.getDeviceStateById(id);
    }

    @PostMapping
    public DeviceState createDeviceState(@RequestBody DeviceState deviceState) {
        return deviceStateService.createDeviceState(deviceState);
    }

    @PutMapping("/{id}")
    public DeviceState updateDeviceState(@PathVariable Integer id, @RequestBody DeviceState deviceState) {
        return deviceStateService.updateDeviceState(id, deviceState);
    }

    @DeleteMapping("/{id}")
    public void deleteDeviceState(@PathVariable Integer id) {
        deviceStateService.deleteDeviceState(id);
    }
}
