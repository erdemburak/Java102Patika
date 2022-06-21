package staticOrnek.course;

public class Course {
    public String name;
    public String code;
    public int note;

    public Course (String name, String code, int note){
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public static void calcAvarage(int[] notes){
        double total = 0;
        for (int j : notes) {
            total += j;
        }
        double avr = total / notes.length;

        System.out.println("Ortalamanız : " + avr);
    }

}
