public abstract class BaseStats{
    protected int hp,maxHp,mp,maxMp,sp,maxSp,str,dex,def,level,baseStr,baseDef,baseDex;
    protected abstract void updateStats();
    public void upLevel(){
        upLevel(1);
    }
    public void upLevel(int lvl) {
        level+=lvl;
        updateStats();
    }
}