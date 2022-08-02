package ioveriakislari.streamreaders.outputstreamreaders;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {

        String data = "ĞÜŞİ";

        try {

            FileOutputStream fileOutput = new FileOutputStream("src/ioveriakislari/patika.txt");

            OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutput, Charset.defaultCharset()); // Charset.forName("UTF8") şeklinde istediğimiz charseti belirleyebiliriz

            //fileOutput.write(data.getBytes(Charset.defaultCharset()));
            fileWriter.write(data);

            fileWriter.close();
            fileOutput.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
