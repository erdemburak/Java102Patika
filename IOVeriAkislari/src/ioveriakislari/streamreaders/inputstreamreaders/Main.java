package ioveriakislari.streamreaders.inputstreamreaders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream("src/ioveriakislari/patika.txt"); // Constructur içerisinde Charset.forName("UTF8") şeklinde charset belirlenebilir.

            InputStreamReader inputReader = new InputStreamReader(fileInput); //CharSet özelliklerini belirleyebilmek için inputstreamreader sınıfını kullanıyoruz.
            System.out.println(inputReader.getEncoding()); //Default charset'i ekrana yazdırıyoruz (Default : UTF8)

            int i = inputReader.read();
            while (i != -1){
                System.out.print((char) i);
                i = inputReader.read();
            }

            fileInput.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
