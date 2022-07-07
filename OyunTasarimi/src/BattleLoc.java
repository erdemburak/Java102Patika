import java.util.Formatter;
import java.util.Random;

public abstract class BattleLoc extends Location {

    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    public boolean onLocation(){

        int obsNumber = this.randomObstacleNumber();
        System.out.println("----------------------------------------");
        System.out.println(this.getName() + " Bölgesindesiniz!!!");
        System.out.println("Dikkatli ol!! bu bölgede "+ obsNumber +" adet " + this.obstacle.getName() + " bulunuyor!!");
        System.out.println("----------------------------------------");
        System.out.print("<S> Savaş veya <K> Kaç : ");
        String selectCase = input.nextLine();

        selectCase = selectCase.toUpperCase();

        if(selectCase.equals("S") && combat(obsNumber)){
                System.out.println(this.getName() + " Bölgesi temizlendi!");
                System.out.println("Temizleme ödülü : " + this.award);

                if(this.award.toUpperCase().equals("GOLD")){
                    this.getPlayer().getInventory().setGold(this.getPlayer().getInventory().getGold() + 1);
                }else if(this.award.toUpperCase().equals("FIREWOOD")){
                    this.getPlayer().getInventory().setFireWood(this.getPlayer().getInventory().getFireWood() + 1);
                }else{
                    this.getPlayer().getInventory().setWater(this.getPlayer().getInventory().getWater() + 1);
                }
                return true;
        }
        System.out.println();
        if(this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz!!!");
            return false;
        }

        return true;
    }

    public boolean combat(int obsNumber) {

        for(int i = 1; i <= obsNumber;i++){
            this.getObstacle().setHealth(this.obstacle.getDefHealth());
            playerStats();
            obstacleStats(i);

            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){

                System.out.println("-- <V> Vur veya <K> Kaç --");
                String selectCombat = input.nextLine().toUpperCase();
                if(selectCombat.equals("V")){
                    System.out.println("Siz vurdunuz !!");
                    obstacle.setHealth(this.obstacle.getHealth() - this.getPlayer().getDamage());
                    afterHit();
                    if(this.getObstacle().getHealth() > 0){
                        System.out.println();
                        System.out.println("Canavar size vurdu ! ");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if(obstacleDamage < 0){
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                }else{
                    return false;
                }
            }

            if(this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println("----------------------------------------");
                System.out.println(i + "." + this.getObstacle().getName() + " öldürüldü!");
                System.out.println(this.getObstacle().getAward() + " para kazandınız!!");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız : " + this.getPlayer().getMoney());
                System.out.println("----------------------------------------");
            }else {
                return false;
            }
        }
        return true;
    }

    public void afterHit(){
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı : " + this.obstacle.getHealth());
    }



    public void playerStats(){
        System.out.println(this.getPlayer().getName() + " Stats");
        System.out.println("--------------------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println("--------------------------");
    }

    public void obstacleStats(int i){
        System.out.println(i+ "." + this.getObstacle().getName() + " Stats");
        System.out.println("--------------------------");
        System.out.println("Hasar : " + this.getObstacle().getDamage());
        System.out.println("Sağlık : " + this.getObstacle().getHealth());
        System.out.println("Ödül : " + this.getObstacle().getAward()+ " para ve " + this.award);
        System.out.println("--------------------------");
    }

    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }




    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}