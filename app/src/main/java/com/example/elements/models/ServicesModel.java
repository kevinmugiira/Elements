package com.example.elements.models;

public class ServicesModel {

    String serviceName;
    int image;

    public ServicesModel(String serviceName, int image) {
        this.serviceName = serviceName;
        this.image = image;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getImage() {
        return image;
    }
}
