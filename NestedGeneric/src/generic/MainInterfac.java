package generic;

public class MainInterfac {
    public static void main(String[] args) {
        Student<String> stu = new Student<>();
        stu.insert("abc");
        Student<Integer> stuInt = new Student<>();
        stuInt.insert(123);
     }
}
