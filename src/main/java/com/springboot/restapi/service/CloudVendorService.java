package com.springboot.restapi.service;

import com.springboot.restapi.model.CloudVendor;
import com.springboot.restapi.repository.CloudVendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    @Autowired
    public CloudVendorService(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    public boolean saveCloudVendor(CloudVendor cloudVendor) {
        return cloudVendorRepository.saveCloudVendor(cloudVendor);
    }

    public CloudVendor getVendorService(String id) {
        return cloudVendorRepository.getCloudVendor(id);
    }

    public boolean udpateCloudVendor(String id, CloudVendor cloudVendor) {
        return cloudVendorRepository.updateCloudVendor(id, cloudVendor);
    }

    public boolean deleteCloudVendor(String id) {
        return cloudVendorRepository.deleteCloudVendor(id);
    }
}
