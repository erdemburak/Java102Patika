package ioveriakislari.serialization;

import java.io.Serializable;

public class Car implements Serializable { // Class a serializable interface'ini dahil etmezsek oluşturulan nesneleri dosya içerisine atma işlemini yapamıyoruz

    private String brand;
    private String model;

    public Car(String brand,String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
