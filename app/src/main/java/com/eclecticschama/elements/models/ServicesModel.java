package com.eclecticschama.elements.models;

public class ServicesModel {

    String serviceName1;
    String serviceName2;
    String serviceName3;
    int image1;
    int image2;
    int image3;

    public ServicesModel(
            String serviceName1,
            String serviceName2,
            String serviceName3,
            int image1,
            int image2,
            int image3) {
        this.serviceName1 = serviceName1;
        this.serviceName2 = serviceName2;
        this.serviceName3 = serviceName3;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }

    public String getServiceName1() {
        return serviceName1;
    }

    public String getServiceName2() {
        return serviceName2;
    }

    public String getServiceName3() {
        return serviceName3;
    }

    public int getImage1() {
        return image1;
    }

    public int getImage2() {
        return image2;
    }

    public int getImage3() {
        return image3;
    }
}
