package ioveriakislari.filereaderwriter.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader readFile = new FileReader("src/ioveriakislari/patika.txt");
            int i = readFile.read();
            while (i != -1){
                System.out.print((char) i);
                i = readFile.read();
            }


            readFile.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
