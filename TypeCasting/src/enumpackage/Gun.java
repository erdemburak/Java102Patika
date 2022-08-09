package enumpackage;

public enum Gun {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int day;

    Gun (int day){
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void getDayName() {
        String day = null;
        switch (this) {
            case PAZARTESI:
                day = "PAZARTESİ";
                break;
            case SALI:
                day = "SALI";
                break;

            /**
             * Switch case için lambda expressin kullanım örneği
             * case 1 -> "PAZARTESİ";
             * case 2 -> "SALI";
             * default -> null;
             * şeklindedir.
             */
        }

        System.out.println(day);


    }

}
