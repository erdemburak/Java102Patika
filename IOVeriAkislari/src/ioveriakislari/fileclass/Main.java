package ioveriakislari.fileclass;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File dosya = new File("src/ioveriakislari/fileclass/patika.txt");
        try {
            if(dosya.createNewFile()){
                System.out.println(dosya.getName() + " dosyası oluşturuldu!");
            }else{
                System.out.println(dosya.getName() + " dosyası zaten mevcut!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //Mevcut dosyanın silinmesi
        File dosya2 = new File("patika.txt");
        dosya2.delete();


        // Dizin içerisinde dosya oluşturma
        File dizin = new File("test");
        dizin.mkdir();

        //Mevcut olmayan bir dizin içerisinde dosya oluşturulmak istenirse önce üstteki adımla dizinin oluşturulması gerekir.
        File dosya3 = new File("test/patika.txt");
        try {
            System.out.println(dosya3.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        dosya3.delete();
        dizin.delete();

        // Dizin oluştururken dosyaları tek tek oluşturmak yerine belirtilen tüm dizinleri tek seferde oluşturmak için
        File dizin2 = new File("patika/dev");
        System.out.println(dizin2.mkdirs());

        //Klasör içerisindeki dosyaları listelemek için
        File dizin3 = new File("patika");
        String[] liste = dizin3.list();
        for(String str : liste){
            System.out.println(str);
        }

    }
}
