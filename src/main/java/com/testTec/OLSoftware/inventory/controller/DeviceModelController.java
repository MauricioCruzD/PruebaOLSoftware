package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.DeviceModelService;
import com.testTec.OLSoftware.inventory.model.DeviceModels;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/devicemodel")
public class DeviceModelController {

    @Autowired
    private DeviceModelService deviceModelService;
   
    @GetMapping("/getDeviceModels")
    public List<DeviceModels> getAllDeviceModel() {
        return deviceModelService.getAllDeviceModel();
    }

    @GetMapping("/getDeviceModel/{id}")
    public DeviceModels getDeviceModelById(@PathVariable Integer id) {
        return deviceModelService.getDeviceModelById(id);
    }

    @PostMapping("/createDeviceModel")
    public DeviceModels createDeviceModel(@RequestBody DeviceModels deviceModel) {
        return deviceModelService.createDeviceModel(deviceModel);
    }

    @PutMapping("/updateDeviceModel/{id}")
    public DeviceModels updateDeviceModel(@PathVariable Integer id, @RequestBody DeviceModels deviceModel) {
        return deviceModelService.updateDeviceModel(id, deviceModel);
    }

    @DeleteMapping("/deleteDeviceModel/{id}")
    public void deleteDeviceModel(@PathVariable Integer id) {
        deviceModelService.deleteDeviceModel(id);
    }
}
