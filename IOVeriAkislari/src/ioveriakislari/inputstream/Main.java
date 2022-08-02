package ioveriakislari.inputstream;

import java.io.File;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            //Mevcut dosyayı okumanın bir yolu aşağıdaki gibidir.
            FileInputStream input = new FileInputStream("src/ioveriakislari/patika.txt");
            /*
            //Diğer bir yolu da
            File dosya = new File("src/ioveriakislari/inputstream/patika.txt");
            //eğer dosya mevcut değil ve program çalışırken oluşturulması isteniyorsa da
            dosya.createNewFile();
            */
            //Parametre olarak verilen sayı kadar karakteri atlayarak sonrası için işlem sağlar
            input.skip(10);

            System.out.println("Kullanılır byte sayısı : " + input.available());
            int i = input.read();
            while (i != -1){

                System.out.print((char) i);
                i = input.read();
            }
            System.out.println();
            System.out.println("Kullanılır byte sayısı : " + input.available());


            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
