public class Cave extends BattleLoc{
    private boolean isBattleLocClear = false;
    public Cave(Player player) {
        super(player, "Cave", new Vampire(), "GOLD",4);
    }

    public boolean isBattleLocClear() {
        return isBattleLocClear;
    }

    public void setBattleLocClear(boolean battleLocClear) {
        isBattleLocClear = battleLocClear;
    }
}
