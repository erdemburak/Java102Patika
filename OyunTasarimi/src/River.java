public class River extends BattleLoc {
    private boolean isBattleLocClear =false;
    public River(Player player) {
        super(player, "River", new Zombie(), "WATER",5 );
    }

    public boolean isBattleLocClear() {
        return isBattleLocClear;
    }

    public void setBattleLocClear(boolean battleLocClear) {
        isBattleLocClear = battleLocClear;
    }
}
