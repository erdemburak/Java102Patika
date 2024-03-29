import java.util.Scanner;

public class Game {

    public Player player;
    public Location location;

    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz!");
        //System.out.print("Lütfen bir isim giriniz : ");
        //String playerName = input.nextLine();

        player = new Player("Elessar");
        System.out.println(player.getName() + " Hoşgeldin !");

        System.out.println("Lütfen bir karakter seç ! ");
        player.selectChar();

        Location location = null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("----------- Bölgeler -----------");
            System.out.println();
            System.out.println("1 - SafeHouse");
            System.out.println("2 - ToolStore");
            System.out.println("3 - Cave(Obstacle)");
            System.out.println("4 - Forest(Obstacle)");
            System.out.println("5 - River(Obstacle)");
            System.out.println("0 - Exit");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = input.nextInt();
            System.out.println();
            switch (selectLoc){
                case 0 :
                    location = null;
                    break;
                case 1 :
                    location = new SafeHouse(player);
                    break;
                case 2 :
                    location = new ToolStore(player);
                    break;
                case 3 :
                    location = new Cave(player);
                    break;
                case 4 :
                    location = new Forest(player);
                    break;
                case 5 :
                    location = new River(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir bölge giriniz !");
            }
            if(location == null){
                System.out.println("Çıkış yapıldı!");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Game Over!");
                break;
            }
        }
    }

}
