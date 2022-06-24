package dependencyComposition;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Burak","Erdem", "123", "address",80);
        Student st2 = new Student("Patika","Java102", "124", "ress",85);

        System.out.println("St2 ders notu : " + st2.getNote());

        // Bir sınıf başka bir sınıftan üretilmiş nesneleri kullanıyor ya da kendisi üretiyorsa o sınıfa bağımlıdır.(Dependency)

        Instructor teacher = new Instructor("Erdem", "Burak" ,"CENG");

        //Composition
        //Course has a instructor (Sınıfın bir öğretmeni vardır)
        Course mat = new Course("Mat101", "MAT", teacher);
        Student[] stu = {st1,st2};
        System.out.println("Ortalama : " + mat.calcAvarage(stu));


        System.out.println("Eğitmen adı : "+ mat.getInstructor().getName());

    }
}
