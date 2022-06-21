package staticOrnek;

public class Main {
    public static void main(String[] args) {
        int a = 10;

        Player p1 = new Player("Burak Erdem", 1);
        System.out.println(p1.name);
        System.out.println(p1.game); // Static tanımlı nitelikleri nesnelerden çağırdığımızda hata almayız ancak kullanımı yanlıştır.
        System.out.println(Player.count);
        //p1.showName();
        Player.showName();

        Player p2 = new Player("Burak Erdem", 2);
        System.out.println(p2.game); // Static tanımlı nitelikler nesnelerden bağımsız olarak class üyesi olduğu için class la çağırmak doğru olacaktır.
        System.out.println(Player.count);
    }
}
