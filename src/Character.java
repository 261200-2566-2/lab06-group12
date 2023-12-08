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
        System.out.println("Health\t: "+hp+"/"+maxHp);
        System.out.println("Mana\t: "+mp+"/"+maxMp);
        System.out.println("Speed\t: "+sp+"/"+maxSp);
        System.out.println("Weapon\t: "+mainHandName+" "+mainHandClass+" level."+mHlvl);
        System.out.println("STATS\t\tBASE\tWEAPON\tSUM");
        System.out.println("Strength\t: "+str+"\t\t+"+mHstr+"\t\t:"+(str+mHstr));
        System.out.println("Defense \t: "+def+"\t\t+"+mHdef+"\t\t:"+(def+mHdef));
        System.out.println("Dexterity\t: "+dex+"\t\t+"+mHdex+"\t\t:"+(dex+mHdex));
    }
    protected void born(){
        hp=maxHp;
        mp=maxMp;
        sp=maxSp;
        alive = true;
    }
}
