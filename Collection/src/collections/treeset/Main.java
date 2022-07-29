package collections.treeset;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //TreeSet oluştururken karşılaştırma yapabilmek için veri türünü bilmesi gerekiyor. Belirtmediğimizde default olarak integer kullanır
        //Ancak veri türümüz integer değil ise hata verecek bu nedenle kullanılan veri türüne göre comparator belirlenmeli

        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());

        students.add(new Student("Burak",80));
        students.add(new Student("Armağan",100));
        students.add(new Student("Erdem",50));

        for(Student stu : students){
            System.out.println(stu.getName());
        }
    }
}
