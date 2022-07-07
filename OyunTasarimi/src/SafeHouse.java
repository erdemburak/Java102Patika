public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    public boolean onLocation(){
        System.out.println("-----------------------------------");
        System.out.println("Güvenli evdesiniz !");
        System.out.println("Canınız yenilendi !");
        System.out.println("-----------------------------------");
        this.getPlayer().setHealth(this.getPlayer().getDefHealth());

        return true;
    }

}
