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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public String getMacAddress() {
        return macAddress;
    }
    @Override
    public boolean equals(Object obj){
        Device dev = (Device) obj;
        return this.getMacAddress().equalsIgnoreCase(dev.getMacAddress());
    }
}



