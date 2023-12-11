public abstract class BaseStats{
    //fields
    protected int hp,maxHp,mp,maxMp,sp,maxSp,str,dex,def,level,baseStr,baseDef,baseDex;
    protected int manaInc,oldMaxMp;
    protected int hpInc,oldMaxHp;
    /**
     * Update stats of a base character
     * effects: update oldMaxHp, oldMaxMp, maxSp, str, def, dex
     */
    protected void updateStats(){
        oldMaxHp = 100+(level*10);
        oldMaxMp = 50+(level*5);
        maxSp = 10+level*5;
        str = baseStr*level+5;
        def = baseDef*level+5;
        dex = baseDex*level+5;
    }
    /**
     * Overload method of upLevel()
     * effects: call upLevel(1)
     */
    public void upLevel(){
        upLevel(1);
    }
    /**
     * Up level a character
     * effects: increase levels of character and call updateStats().
     * @param lvl a positive integer to increase level of a character
     *
     */
    public void upLevel(int lvl) {
        level+=lvl;
        updateStats();
    }
}