package casting;

public class WrapperCasting {
    public static void main(String[] args) {

        /**
         * Wrapper sınıflarında tip dönüşümü aşağıdaki şekilde yapılabilir.
         */
        int a = 20;
        System.out.println("Integer = " + a);

        String str = String.valueOf(a);
        System.out.println("String = " + str);

        int b = Integer.parseInt(str);
        System.out.println("Integer toplam = " + b + a);
    }
}
