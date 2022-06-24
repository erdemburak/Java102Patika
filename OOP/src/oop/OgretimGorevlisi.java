package oop;

public class OgretimGorevlisi extends Akademisyen{
    private int kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, int kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public void senatoToplanti(){
        System.out.println(this.getAdSoyad()+ " senato toplantısına katildi !");
    }

    @Override
    public void derseGir() {
        System.out.println(this.getAdSoyad() + " derse giriyor !");
    }

    @Override
    public void giris(){
        System.out.println("Öğretim Görevlisi " + this.getAdSoyad() + " B kapısından giriş yaptı !");
    }

    public void sinavYap(){
        System.out.println(this.getAdSoyad() + " sınav yapıyor !");
    }

    public int getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }
}
