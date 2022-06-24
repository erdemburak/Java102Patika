package oop;

public class BilgiIslem extends Memur{
    private String gorev;

    public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }

    public void networkKurulumu(){
        System.out.println(this.getAdSoyad()+ " network kurulumu yapıyor !!");
    }


    public String getGorev(){
        return this.gorev;
    }
    public void setGorev(String gorev){
        this.gorev = gorev;
    }

}
