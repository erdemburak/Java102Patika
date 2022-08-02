package ioveriakislari.serialization.objectoutput;

import ioveriakislari.serialization.Car;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Audi" , "A7");

        try {
            FileOutputStream outputFile = new FileOutputStream("src/ioveriakislari/serialization/araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
