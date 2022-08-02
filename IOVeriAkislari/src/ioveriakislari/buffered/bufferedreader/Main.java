package ioveriakislari.buffered.bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader readerFile = new FileReader("src/ioveriakislari/patika.txt");

            BufferedReader readBuff = new BufferedReader(readerFile);

            /*
            String line = readBuff.readLine();
            while (line != null){
                System.out.println(line);
                line = readBuff.readLine();
            }
            */

            String line ;

            while ((line = readBuff.readLine()) != null){
                System.out.print(line + " ### ");
            }



            readBuff.close();
            readerFile.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
