package ioveriakislari.buffered.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream("src/ioveriakislari/patika.txt");
            BufferedInputStream buffInput = new BufferedInputStream(fileInput); // BufferedInputStream'in tek farkı çok fazla veri içeren dosyaları
                                                                                // okumayı kolaylaştırmak için yazılmış bir bloktur.

            int i = buffInput.read();
            while (i != -1){
                System.out.print((char) i);
                i = buffInput.read();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
