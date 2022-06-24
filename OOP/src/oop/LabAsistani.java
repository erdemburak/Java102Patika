package oop;

public class LabAsistani extends Asistan{
    public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, int ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + " laboratuvara giriyor !");
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad() + " derse giriyor !");
    }

}
