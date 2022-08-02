package ioveriakislari.printwriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter; // PrintWriter girilen her türlü değeri string'e çevirerek çıktı veren bir kütüphanedir

public class Main {
    public static void main(String[] args) {

        String data = "Java 102";

        PrintWriter writer = null;
        try {
            writer = new PrintWriter("src/ioveriakislari/patika.txt");

            writer.print(12431234);
            writer.print(data);

            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
