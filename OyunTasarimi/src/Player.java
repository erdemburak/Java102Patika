import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int defHealth;
    private int money;
    private String charName;
    private String name;
    private Inventory inventory;
    private Scanner input = new Scanner(System.in);

    public Player (String name){
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar(){
        GameChar[] charList = {new Samurai(),new Archer(),new Knight()};
        System.out.println("-------------------------------------");
        for (GameChar gameChar: charList) {
            System.out.println("ID : " + gameChar.getId() +
                    " Karakter : "+ gameChar.getName() +
                    "\t Hasar : " + gameChar.getDamage() +
                    "\t Sağlık : " + gameChar.getHealth() +
                    "\t Para : " + gameChar.getMoney());
        }
        System.out.println("-------------------------------------");
        System.out.print("Lütfen bir karakter giriniz : ");
        int slectChar = input.nextInt();
        switch (slectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
        /*System.out.println("Karakte : " + this.getCharName()+
                "\t Hasar : " + this.getDamage() +
                "\t Sağlık : " + this.getHealth() +
                "\t Para : " + this.getMoney());*/

    }
    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setDefHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public void printInfo(){
        System.out.println("Silah : " + this.getInventory().getWeapon().getName()+
                "\t Zırh : " + this.getInventory().getArmor().getName()+
                "\t Bloklama : " + this.getInventory().getArmor().getBlock()+
                "\t Hasar : " + this.getTotalDamage() +
                "\t Sağlık : " + this.getHealth() +
                "\t Para : " + this.getMoney());
    }


    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0){
            health = 0;
        }
        this.health = health ;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public int getDefHealth() {
        return defHealth;
    }

    public void setDefHealth(int defHealth) {
        this.defHealth = defHealth;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
