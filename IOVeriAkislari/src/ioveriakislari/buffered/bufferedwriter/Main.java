package ioveriakislari.buffered.bufferedwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String data = "JAVAÖĞRENİYORUM";
        File dosya = new File("src/ioveriakislari/patika.txt");
        try {
            FileWriter writeFile = new FileWriter(dosya,true );

            BufferedWriter writeBuff = new BufferedWriter(writeFile);

            writeBuff.write(data);


            writeBuff.close();
            writeFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
