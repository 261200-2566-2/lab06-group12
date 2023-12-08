public abstract class Weapon {
    protected int level;

    public int getLevel() {return level;}
    public void upLevel(){upLevel(1);}
    public void upLevel(int lvl) {
        level+=lvl;
        updateStats();
    }
    protected abstract void updateStats();
}
