package first;

public class First {
    public String str;

    public First (String str){
        this.str = str;
    }

    // Protected tanımladığımız değişkenler ve methodlar sadece bulundukları package içinden erişime açıktır.
    // Aşağıdaki contructor methodunu aktifleştirdiğimizde bu methodu kullanan main classı için çalışır ancak
    // second package'ında bulunan second classı bu methodu kullanamaz.
    /*
    protected First (String str){
        this.str = str;
    }
    */

    //Private tanımlı değişkene erişim için
    /*
    private void showStr(){
        System.out.println(this.str);
    }

    void show(){
        this.showStr();
    }*/



}
