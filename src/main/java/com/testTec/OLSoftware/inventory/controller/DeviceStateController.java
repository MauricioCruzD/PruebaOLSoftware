package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.DeviceStateService;
import com.testTec.OLSoftware.inventory.model.DeviceStates;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/devicestate")
public class DeviceStateController {

    @Autowired
    private DeviceStateService deviceStateService;
   
    @GetMapping("/getDeviceStates")
    public List<DeviceStates> getAllDeviceState() {
        return deviceStateService.getAllDeviceState();
    }

    @GetMapping("/getDeviceState/{id}")
    public DeviceStates getDeviceStateById(@PathVariable Integer id) {
        return deviceStateService.getDeviceStateById(id);
    }

    @PostMapping("/createDeviceState")
    public DeviceStates createDeviceState(@RequestBody DeviceStates deviceState) {
        return deviceStateService.createDeviceState(deviceState);
    }

    @PutMapping("/updateDeviceState/{id}")
    public DeviceStates updateDeviceState(@PathVariable Integer id, @RequestBody DeviceStates deviceState) {
        return deviceStateService.updateDeviceState(id, deviceState);
    }

    @DeleteMapping("/deleteDeviceState/{id}")
    public void deleteDeviceState(@PathVariable Integer id) {
        deviceStateService.deleteDeviceState(id);
    }
}
