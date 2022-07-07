public class Forest extends BattleLoc{
    private boolean isBattleLocClear = false;
    public Forest(Player player) {
        super(player, "Forest", new Bear(), "FIREWOOD",3);
    }

    public boolean isBattleLocClear() {
        return isBattleLocClear;
    }

    public void setBattleLocClear(boolean battleLocClear) {
        isBattleLocClear = battleLocClear;
    }
}
