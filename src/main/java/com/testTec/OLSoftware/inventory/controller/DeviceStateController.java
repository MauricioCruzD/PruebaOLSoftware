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
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/devicestate")
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class DeviceStateController {

    @Autowired
    private DeviceStateService deviceStateService;
   
    @GetMapping("/getDeviceStates")
    public List<DeviceState> getAllDeviceState() {
        return deviceStateService.getAllDeviceState();
    }

    @GetMapping("/getDeviceState/{id}")
    public DeviceState getDeviceStateById(@PathVariable Integer id) {
        return deviceStateService.getDeviceStateById(id);
    }

    @PostMapping("/createDeviceState")
    public DeviceState createDeviceState(@RequestBody DeviceState deviceState) {
        return deviceStateService.createDeviceState(deviceState);
    }

    @PutMapping("/updateDeviceState/{id}")
    public DeviceState updateDeviceState(@PathVariable Integer id, @RequestBody DeviceState deviceState) {
        return deviceStateService.updateDeviceState(id, deviceState);
    }

    @DeleteMapping("/deleteDeviceState/{id}")
    public void deleteDeviceState(@PathVariable Integer id) {
        deviceStateService.deleteDeviceState(id);
    }
}
