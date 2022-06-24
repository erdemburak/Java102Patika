package oop;

public class Asistan extends Akademisyen{
    private int ofisSaati;

    public Asistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, int ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad() + " quiz yapıyor!!");
    }


    public int getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(int ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    @Override
    public void derseGir() {
        System.out.println(this.getAdSoyad() + " derse giriyor !");
    }
}
