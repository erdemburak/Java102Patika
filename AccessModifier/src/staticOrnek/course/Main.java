package staticOrnek.course;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "Mat-101", 70);
        Course fizik = new Course("Fizik", "Fiz-101", 20);
        Course kimya = new Course("Kimya", "Kim-101", 100);

        int[] notes = {70,20,100};
        //mat.calcAvarage(notes); // Methodu static tanımlamadan önce erişebilmek için nesneyi kullanmamız gerekiyordu.
        Course.calcAvarage(notes); // Static tanımladığımız için Course class'ı üzerinden direkt erişebiliyoruz.

        Course[] dersler = {mat,fizik,kimya};
        Calculate.calcAvarage(dersler);

    }

}
