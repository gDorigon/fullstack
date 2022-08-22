package com.gdorigon.HelloWorld.models;

public class Device {

    private String nome;
    private String brand;
    private Boolean wifi;
    private String macAddress;

    public Device() {}

    public String getNome() {
        return nome;
    }

    public String getBrand() {
        return brand;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public String getMacAddress() {
        return macAddress;
    }
}
