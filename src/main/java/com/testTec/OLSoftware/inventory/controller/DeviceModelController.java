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
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/devicemodel")
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class DeviceModelController {

    @Autowired
    private DeviceModelService deviceModelService;
   
    @GetMapping("/getDeviceModels")
    public List<DeviceModel> getAllDeviceModel() {
        return deviceModelService.getAllDeviceModel();
    }

    @GetMapping("/getDeviceModel/{id}")
    public DeviceModel getDeviceModelById(@PathVariable Integer id) {
        return deviceModelService.getDeviceModelById(id);
    }

    @PostMapping("/createDeviceModel/{id}")
    public DeviceModel createDeviceModel(@RequestBody DeviceModel deviceModel) {
        return deviceModelService.createDeviceModel(deviceModel);
    }

    @PutMapping("/updateDeviceModel/{id}")
    public DeviceModel updateDeviceModel(@PathVariable Integer id, @RequestBody DeviceModel deviceModel) {
        return deviceModelService.updateDeviceModel(id, deviceModel);
    }

    @DeleteMapping("/deleteDeviceModel/{id}")
    public void deleteDeviceModel(@PathVariable Integer id) {
        deviceModelService.deleteDeviceModel(id);
    }
}
