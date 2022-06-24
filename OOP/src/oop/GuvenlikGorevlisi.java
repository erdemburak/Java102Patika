package oop;

public class GuvenlikGorevlisi extends Memur {
    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai,String belge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge = belge;
    }

    public void nobet(){
        System.out.println(this.getAdSoyad()+ " nöbet tutuyor!!!");
    }

    public String getBelge(){
        return this.belge;
    }
    public void setBelge(String belge) {
        this.belge = belge;
    }
}
