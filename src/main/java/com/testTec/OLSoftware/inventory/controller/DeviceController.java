package com.testTec.OLSoftware.inventory.controller;

/**
 *
 * @author macru
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.testTec.OLSoftware.inventory.service.DeviceService;
import com.testTec.OLSoftware.inventory.model.Device;

import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    @Autowired
    private DeviceService service;

    @GetMapping
    public List<Device> getAllDevices() {
        return service.getAllDevices();
    }

    @GetMapping("/{id}")
    public Device getDeviceById(@PathVariable Integer id) {
        return service.getDeviceById(id);
    }

    @PostMapping
    public Device createDevice(@RequestBody Device device) {
        return service.createDevice(device);
    }

    @PutMapping("/{id}")
    public Device updateDevice(@PathVariable Integer id, @RequestBody Device device) {
        return service.updateDevice(id, device);
    }

    @DeleteMapping("/{id}")
    public void deleteDevice(@PathVariable Integer id) {
        service.deleteDevice(id);
    }
}