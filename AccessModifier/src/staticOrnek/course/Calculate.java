package staticOrnek.course;

public class Calculate {
    public static void calcAvarage(Course[] notes){
        double total = 0;
        for (Course j : notes) {
            total += j.note;
        }
        double avr = total / notes.length;

        System.out.println("Ortalamanız : " + avr);
    }
}
