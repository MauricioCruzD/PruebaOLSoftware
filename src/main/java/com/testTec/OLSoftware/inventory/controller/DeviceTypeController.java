package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.DeviceTypeService;
import com.testTec.OLSoftware.inventory.model.DeviceTypes;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/devicetype")
public class DeviceTypeController {

    @Autowired
    private DeviceTypeService deviceTypeService;
   
    @GetMapping("/getDeviceTypes")
    public List<DeviceTypes> getAllDeviceType() {
        return deviceTypeService.getAllDeviceType();
    }

    @GetMapping("/getDeviceType/{id}")
    public DeviceTypes getDeviceTypeById(@PathVariable Integer id) {
        return deviceTypeService.getDeviceTypeById(id);
    }

    @PostMapping("/createDeviceType")
    public DeviceTypes createDeviceType(@RequestBody DeviceTypes deviceType) {
        return deviceTypeService.createDeviceType(deviceType);
    }

    @PutMapping("/updateDeviceType/{id}")
    public DeviceTypes updateDeviceType(@PathVariable Integer id, @RequestBody DeviceTypes deviceType) {
        return deviceTypeService.updateDeviceType(id, deviceType);
    }

    @DeleteMapping("/deleteDeviceType/{id}")
    public void deleteDeviceType(@PathVariable Integer id) {
        deviceTypeService.deleteDeviceType(id);
    }
}
