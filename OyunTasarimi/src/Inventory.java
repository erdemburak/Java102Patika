public class Inventory {

    private Weapon weapon;
    private Armor armor;
    private int gold = 0;
    private int fireWood = 0;
    private int water = 0;
    public Inventory() {
        this.weapon = new Weapon("Yumruk", 0, 0,0);
        this.armor = new Armor(0, "Basic", 0, 0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }
    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getFireWood() {
        return fireWood;
    }

    public void setFireWood(int fireWood) {
        this.fireWood = fireWood;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
}