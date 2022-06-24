package oop;

public class Patika {
    public static void main(String[] args) {

        Calisan c1 = new Calisan("Burak Erdem", "05535674754", "burakerdem6@hotmail.com");

        //Akademisyen a1 = new Akademisyen("Armağan Akyol", "1223423423", "armi@armi.com","Psikoloji" ,"Klinik Psikolog"); // Sınıfı abstract tanımladığımız için bu sınıftan nesne üretilemez
        Memur m1 = new Memur("Ali Veli", "2341234213", "m@patica.dev", "Bilgi İşlem", "09:00-18:00" );

        //Aşağıdaki şekilde çalışan sınıfından yeni bir memur üretilebilir ancak bu durumda memur sınıfının methodlarına ulaşılamaz.
        //Calisan m1 = new Memur("Ali Veli", "2341234213", "m@patica.dev", "Bilgi İşlem", "09:00-18:00" );

        OgretimGorevlisi o1 = new OgretimGorevlisi("Patika Java", "24346235", "bilgi@patika.dev", "CENG","Yard. Doçent", 3);

        //Polymorphism (Çok biçimlilik)
        /*o1.giris();
        a1.giris();
        c1.giris();
        m1.giris();*/
        //Calisan a2 = new Akademisyen("BilgeAdam", "1223423423", "bilgi@bilgi.dev","CENG" ,"Doçent"); // Abstract sınıf
        //a2.giris(); //Abstract sınıftan oluşturulan nesne olduğu için kapattık
        //a2.getBolum();
        //int[] loginUser = new int[5];

        Calisan[] loginUser = {c1,m1,o1};
        Calisan.girisYapanlar(loginUser);
    }
}
