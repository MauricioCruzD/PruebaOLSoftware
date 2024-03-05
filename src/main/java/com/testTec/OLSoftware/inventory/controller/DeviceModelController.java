package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import com.testTec.OLSoftware.inventory.service.DeviceModelService;
import com.testTec.OLSoftware.inventory.model.DeviceModel;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/deviceModel")
public class DeviceModelController {

    @Autowired
    private DeviceModelService deviceModelService;
   
    @GetMapping
    public List<DeviceModel> getAllDeviceModel() {
        return deviceModelService.getAllDeviceModel();
    }

    @GetMapping("/{id}")
    public DeviceModel getDeviceModelById(@PathVariable Integer id) {
        return deviceModelService.getDeviceModelById(id);
    }

    @PostMapping
    public DeviceModel createDeviceModel(@RequestBody DeviceModel deviceModel) {
        return deviceModelService.createDeviceModel(deviceModel);
    }

    @PutMapping("/{id}")
    public DeviceModel updateDeviceModel(@PathVariable Integer id, @RequestBody DeviceModel deviceModel) {
        return deviceModelService.updateDeviceModel(id, deviceModel);
    }

    @DeleteMapping("/{id}")
    public void deleteDeviceModel(@PathVariable Integer id) {
        deviceModelService.deleteDeviceModel(id);
    }
}
