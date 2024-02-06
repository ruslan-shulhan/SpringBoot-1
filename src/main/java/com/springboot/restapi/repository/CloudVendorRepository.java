package com.springboot.restapi.repository;

import com.springboot.restapi.model.CloudVendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CloudVendorRepository {

    Map<String, CloudVendor> dataBase = new HashMap<>();

    public CloudVendorRepository() {}

    public boolean saveCloudVendor(CloudVendor cloudVendor) {
        if (!dataBase.containsKey(cloudVendor.getId())) {
            dataBase.put(cloudVendor.getId(), cloudVendor);
            return true;
        }

        return false;
    }

    public CloudVendor getCloudVendor(String id) {
        if (dataBase.containsKey(id)) {
            return dataBase.get(id);
        }

        return null;
    }

    public boolean updateCloudVendor(String id, CloudVendor cloudVendor) {
        if (dataBase.containsKey(id)) {
            dataBase.put(id, cloudVendor);
            return true;
        }

        return false;
    }

    public boolean deleteCloudVendor(String id) {
        if (dataBase.containsKey(id)) {
            dataBase.remove(id);
            return true;
        }

        return false;
    }
}
