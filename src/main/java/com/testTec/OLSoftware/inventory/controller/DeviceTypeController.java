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

@RestController
@RequestMapping("/devicetype")
public class DeviceTypeController {

    @Autowired
    private DeviceTypeService deviceTypeService;
   
    @GetMapping
    public List<DeviceType> getAllDeviceType() {
        return deviceTypeService.getAllDeviceType();
    }

    @GetMapping("/{id}")
    public DeviceType getDeviceTypeById(@PathVariable Integer id) {
        return deviceTypeService.getDeviceTypeById(id);
    }

    @PostMapping
    public DeviceType createDeviceType(@RequestBody DeviceType deviceType) {
        return deviceTypeService.createDeviceType(deviceType);
    }

    @PutMapping("/{id}")
    public DeviceType updateDeviceType(@PathVariable Integer id, @RequestBody DeviceType deviceType) {
        return deviceTypeService.updateDeviceType(id, deviceType);
    }

    @DeleteMapping("/{id}")
    public void deleteDeviceType(@PathVariable Integer id) {
        deviceTypeService.deleteDeviceType(id);
    }
}
