package ioveriakislari.buffered.bufferedoutputstream;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        String data = "Java 102 Patikasi";

        try {
            FileOutputStream fileOutput = new FileOutputStream("src/ioveriakislari/patika.txt");
            BufferedOutputStream buffOutput = new BufferedOutputStream(fileOutput); // BufferedInputStream'in tek farkı çok fazla veri içeren dosyaları
                                                                                    // okumayı kolaylaştırmak için yazılmış bir bloktur.

            byte[] byteArray = data.getBytes();
            buffOutput.write(byteArray);

            buffOutput.close();
            fileOutput.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
