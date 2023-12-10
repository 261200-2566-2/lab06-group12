public abstract class BaseStats{
    protected int hp,maxHp,mp,maxMp,sp,maxSp,str,dex,def,level,baseStr,baseDef,baseDex;
    protected int manaInc,oldMaxMp;
    protected int hpInc,oldMaxHp;
    protected void updateStats(){
        oldMaxHp = 100+(level*10);
        oldMaxMp = 50+(level*5);
        maxSp = 10+level*5;
        str = baseStr*level+5;
        def = baseDef*level+5;
        dex = baseDex*level+5;
    }
    public void upLevel(){
        upLevel(1);
    }
    public void upLevel(int lvl) {
        level+=lvl;
        updateStats();
    }
}