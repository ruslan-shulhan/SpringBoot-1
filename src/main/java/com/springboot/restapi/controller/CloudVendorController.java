package com.springboot.restapi.controller;

import com.springboot.restapi.model.CloudVendor;
import com.springboot.restapi.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/v1/cloudvendors")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    @Autowired
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{id}")
    public CloudVendor getCloudVendor(@PathVariable String id) {
        if (Objects.isNull(id)) return null;

        return cloudVendorService.getVendorService(id);
    }

    @PostMapping("/")
    public boolean saveCloudVendor(@RequestBody CloudVendor cloudVendor) {
        if (Objects.isNull(cloudVendor)) {
            return false;
        }

        return cloudVendorService.saveCloudVendor(cloudVendor);
    }

    @PutMapping("/{id}")
    public boolean updateCloudVendor(@PathVariable String id, @RequestBody CloudVendor cloudVendor) {
        if (Objects.isNull(id) || Objects.isNull(cloudVendor)) {
            return false;
        }

        return cloudVendorService.udpateCloudVendor(id, cloudVendor);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCloudVendor(@PathVariable String id) {
        if (Objects.isNull(id)) return false;

        return cloudVendorService.deleteCloudVendor(id);
    }
}
