package map.linkedhashmap;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Integer, Students> students = new LinkedHashMap<>();

        students.put(102, new Students(102,"Burak",80));
        students.put(101, new Students(101,"Armağan",100));
        students.put(103, new Students(103,"Erdem",50));

        for(Students stu : students.values()){
            System.out.println(stu.getName());
        }

    }
}
