package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.DeviceTypeService;
import com.testTec.OLSoftware.inventory.model.DeviceType;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/devicetype")
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class DeviceTypeController {

    @Autowired
    private DeviceTypeService deviceTypeService;
   
    @GetMapping("/getDeviceTypes")
    public List<DeviceType> getAllDeviceType() {
        return deviceTypeService.getAllDeviceType();
    }

    @GetMapping("/getDeviceType/{id}")
    public DeviceType getDeviceTypeById(@PathVariable Integer id) {
        return deviceTypeService.getDeviceTypeById(id);
    }

    @PostMapping("/createDeviceType")
    public DeviceType createDeviceType(@RequestBody DeviceType deviceType) {
        return deviceTypeService.createDeviceType(deviceType);
    }

    @PutMapping("/updateDeviceType/{id}")
    public DeviceType updateDeviceType(@PathVariable Integer id, @RequestBody DeviceType deviceType) {
        return deviceTypeService.updateDeviceType(id, deviceType);
    }

    @DeleteMapping("/deleteDeviceType/{id}")
    public void deleteDeviceType(@PathVariable Integer id) {
        deviceTypeService.deleteDeviceType(id);
    }
}
