package generic;

public class Print {

    public static <T> void printArray(T[] arr){
        for(T i : arr){
            System.out.print(i + ", ");
        }
    }

}
