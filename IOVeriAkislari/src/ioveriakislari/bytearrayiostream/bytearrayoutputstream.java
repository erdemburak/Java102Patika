package ioveriakislari.bytearrayiostream;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

public class bytearrayoutputstream {
    public static void main(String[] args) {

        String data = "Java 102 Dersleri!";

        ByteOutputStream output = new ByteOutputStream();
        byte[] dataByteArray = data.getBytes();
        output.write(dataByteArray);
        String newData = output.toString();
        System.out.println("Çıkış Akışı : " + newData);
        output.close();
    }
}
