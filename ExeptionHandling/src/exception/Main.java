package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program başladı");
        Scanner input = new Scanner(System.in);

        int a = 1;
        int b = 20;
        int c ;
        int[] arr = new int[2];

        try{
            System.out.println("Bölme işlemi");
            System.out.println(b / a);
            System.out.println("Bölme işlemi bitti");
            System.out.print("Bir sayı girin : ");
            c = input.nextInt();
            arr[10] = 11;
        }catch (ArithmeticException e){   // Eğer oluşan hataya göre farklı işlemler yapılmasını istiyorsak özellikle o hata için catch bloğu yazabiliriz.
            System.out.println("Aritmetik hata bulundu");
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Yanlış veri girildi");
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){ // Eğer oluşan hataların özelinde bir işlem yapmayacaksak Exception olarak tanımladığımızda tüm hataları yakalar
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Bu kısım kesinlikle çalışacak");
        }


        System.out.println("Program bitti");

    }
}
