package exception;

import java.util.Scanner;

public class Throw {

    public static void checkAge(int age) throws Exception { // Runtime exceptionlar dışındaki exceptionları method içerisinde kullanabilmek için kullanılan methoda throws exception eklenmeli
        if(age < 18){
            throw new Exception("Yaşınız tutmuyor");
        }
        System.out.println("Yaşınız uygundur");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();

        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println("Yaşınız uygun değildir.");
            System.out.println(e.toString());
        }
        System.out.println("Program bitti");
    }
}
