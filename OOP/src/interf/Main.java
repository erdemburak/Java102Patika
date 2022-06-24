package interf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Tutar giriniz : ");
        double price = input.nextDouble();
        System.out.print("Kart no giriniz : ");
        String cardNumber = input.next();
        System.out.print("Son Kullanım tarihi giriniz : ");
        String expiryDate = input.next();
        System.out.print("Güvenlik kodu giriniz : ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("1. B Bankası");
        System.out.println("1. C Bankası");
        System.out.print("Banka seçiniz : ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1:
                ABankasi aPos = new ABankasi("A Bankası" , "1242134123", "21342134");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,expiryDate,cvc);
                break;
            case 2:
                break;
            default:
                System.out.println("Geçerli banka giriniz");
        }

    }
}
