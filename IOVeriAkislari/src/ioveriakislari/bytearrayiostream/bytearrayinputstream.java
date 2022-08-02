package ioveriakislari.bytearrayiostream;

import java.io.ByteArrayInputStream;

public class bytearrayinputstream {
    public static void main(String[] args) {
        byte[] dizi = {1,2,3,44,56,75};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi);
        //ByteArrayInputStream input = new ByteArrayInputStream(dizi ,2 ,4); // offset başlangıç indisini belirtir. length ile de kaç değer çekileceği belirtilir
        //input.read ile okuma işlemi yapabiliriz okunan değeri listeden siler
        System.out.println("Kullanılabilen byte sayısı : " + input.available());
        System.out.println(input.read());
        input.skip(2); // 2 değer atlar mevcut durumda array deki 2 ve 3 değerlerini atlayacak
        int i = input.read();
        while (i != -1){
            System.out.println(i);
            i = input.read();
        }
        System.out.println("Kullanılabilen byte sayısı : " + input.available());
    }
}
