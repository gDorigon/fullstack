package com.gdorigon.HelloWorld.services.implementation;

import com.gdorigon.HelloWorld.models.Device;
import com.gdorigon.HelloWorld.services.MyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class myServiceImpl implements MyService {

    //MOCK BECAUSE WE DON'T HAVE A DATABASE... YET.
    private List<Device> myDevices = new ArrayList<>();

    @Override
    public Device save(Device device) {

        myDevices.add(device);
        return device;
    }

    @Override
    public Device getDeviceByMac(String macAddress) {
        return null;
    }

    @Override
    public List<Device> getAllDevices() {

        return myDevices;
    }
}
