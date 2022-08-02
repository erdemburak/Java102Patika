package ioveriakislari.filereaderwriter.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String data ="Java Öğreniyorum";

        try {
            FileWriter writerFile = new FileWriter("src/ioveriakislari/patika.txt",true);

            writerFile.write(data);

            writerFile.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
