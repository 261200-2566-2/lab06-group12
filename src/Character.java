public abstract class Character extends BaseStats{
    //fields
    protected String name;
    protected boolean alive;
    protected Ring ringSlot1,ringSlot2;
    protected Glove glove;
    protected String job;

    //getter
    //methods
    public String getName() {return name;}
    protected int calculateDmg(int mhStr,int mhDex){
        return mhStr*2+mhDex+str;
    }
    protected int calculateDef(int mhDef,int mhStr){
        return mhDef*2+mhStr+def;
    }
    protected abstract int calculateDef();
    protected abstract int calculateDmg();
    protected void beingAttack(int dmg){
        int calDef = calculateDef();
        int rawDmg = dmg-calDef;
        System.out.println(name + " take that with "+calDef+" defense units");
        if(rawDmg>0)
            if(hp<rawDmg)   hp=0;
            else    hp-=rawDmg;
        else rawDmg=0;
        System.out.println(name + " got damaged "+rawDmg+" units");
        System.out.println(name+"'s Health : "+hp+"/"+maxHp);
        if(hp<=0){
            alive = false;
            System.out.println(name + " has been slain. . .");
        }
        System.out.println();
    }
    protected void statsDisplays(String mainHandName,String mainHandClass,int mHlvl,
                                 int mHstr,int mHdef, int mHdex){
        System.out.println("Name\t: "+name+" "+job+" level."+level);
        System.out.println("Status\t: "+(alive?"ALIVE":"DEAD"));
        System.out.println("Health\t: "+hp+"/"+maxHp+" ("+oldMaxHp+"+"+hpInc+")");
        System.out.println("Mana\t: "+mp+"/"+maxMp+" ("+oldMaxMp+"+"+manaInc+")");
        System.out.println("Speed\t: "+sp+"/"+maxSp);
        accessoryDisplay();
        System.out.println("Weapon\t: "+mainHandName+" "+mainHandClass+" level."+mHlvl);
        System.out.println("STATS\t\tBASE\tWEAPON\tSUM");
        System.out.println("Strength\t: "+str+" \t+"+mHstr+"\t\t:"+(str+mHstr));
        System.out.println("Defense \t: "+def+" \t+"+mHdef+"\t\t:"+(def+mHdef));
        System.out.println("Dexterity\t: "+dex+" \t+"+mHdex+"\t\t:"+(dex+mHdex));
    }
    protected void accessoryDisplay(){
        if(ringSlot1!=null) {System.out.println("Ring slot 1\t: " + ringSlot1.getName());}
        if(ringSlot2!=null) {System.out.println("Ring slot 2\t: " + ringSlot2.getName());}
        if(glove!=null) {System.out.println("Glove slot 1 : " + glove.getName());}
        if(ringSlot1!=null||ringSlot2!=null) System.out.println("Extra mana\t: "+manaInc);
        if(glove!=null) System.out.println("Extra health\t: "+hpInc);
    }
    protected void born(){
        hp=maxHp;
        mp=maxMp;
        sp=maxSp;
        alive = true;
    }
    public void heal(){
        System.out.println();
        System.out.println(name + " heal . . .");
        hp = maxHp;
        mp = maxMp;
        System.out.println("Health\t: "+hp+"/"+maxHp);
        System.out.println("Mana\t: "+mp+"/"+maxMp);
        System.out.println();
    }
    public void setRingSlot1(Ring ringSlot1) {
        this.ringSlot1 = ringSlot1;
        updateStats();
    }
    public void setRingSlot2(Ring ringSlot2) {
        this.ringSlot2 = ringSlot2;
        updateStats();
    }
    public void setGlove(Glove glove) {
        this.glove = glove;
        updateStats();
    }
    @Override
    protected void updateStats() {
        super.updateStats();
        int ring1;
        int ring2;
        if(ringSlot1!=null) ring1 = ringSlot1.passiveStat();
        else    ring1 = 0;
        if(ringSlot2!=null) ring2 = ringSlot2.passiveStat();
        else    ring2 = 0;
        manaInc = ring1 + ring2;
        if(glove != null)   hpInc = glove.passiveStat();
        else    hpInc = 0;
        maxMp = oldMaxMp + manaInc;
        maxHp = oldMaxHp + hpInc;
    }
}
