package ioveriakislari.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String giris = "\n--Output islemleri--";
        String yazi = "\nOutputStream ogreniyorum \nPatika Dev";
        try {
            File dosya = new File("src/ioveriakislari/patika.txt");
            //FileOutputStream output = new FileOutputStream("src/ioveriakislari/patika.txt", true);
            FileOutputStream output = new FileOutputStream(dosya, true); //Output işlemi gerçekleştirirken kullanılacak dosya içeriklerinin silinmemesini
                                                                                //içeriğin devamı olarak eklenmesini istiyorsak append kısmını true yapıyoruz
            byte[] yaziByte = yazi.getBytes();
            byte[] girisByte = giris.getBytes();

            output.write(girisByte);
            output.write(yaziByte);

            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
