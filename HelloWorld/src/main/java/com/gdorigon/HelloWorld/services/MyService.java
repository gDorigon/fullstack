package com.gdorigon.HelloWorld.services;

import com.gdorigon.HelloWorld.models.Device;

import java.util.List;

public interface MyService {

    Device save(Device device);
    Device getDeviceByMac(String macAddress);
    List<Device> getAllDevices();
}
