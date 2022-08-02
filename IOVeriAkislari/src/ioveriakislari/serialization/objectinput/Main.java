package ioveriakislari.serialization.objectinput;

import ioveriakislari.serialization.Car;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Audi" , "A7");

        try {
            FileInputStream inputFile = new FileInputStream("src/ioveriakislari/serialization/araba.txt");
            ObjectInputStream input = new ObjectInputStream(inputFile);
            Car newCar = (Car) input.readObject();  // Dosya içerisindeki bulduğu ilk nesneyi döndürecek ve dönen nesnenin
                                                    // dürünü belirtmek için başına Car olarak belirtmemiz gerekiyor.

            System.out.println("Marka : " + newCar.getBrand());
            System.out.println("Model : " + newCar.getModel());

            inputFile.close();
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
