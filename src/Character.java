public abstract class Character extends BaseStats{
    //fields
    protected String name;
    protected boolean alive;
    protected Ring ringSlot1,ringSlot2;
    protected Glove glove;
    //constructors
    public Character(String name,int level){
        this.name = name;
        this.level = level;
        alive = true;
        updateStats();
    }
    //getter
    //methods
    public String getName() {return name;}
    protected abstract int calculateDmg();
    protected abstract int calculateDef();
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
    protected void statsDisplays(String className,String mainHandName,String mainHandClass,int mHlvl,
                                 int mHstr,int mHdef, int mHdex){
        System.out.println("Name\t: "+name+" "+className+" level."+level);
        System.out.println("Status\t: "+(alive?"ALIVE":"DEAD"));
        System.out.println("Weapon\t: "+mainHandName+" "+mainHandClass+" level."+mHlvl);
        System.out.println("STATS\tBASE\tWEAPON\tSUM");
        System.out.println("Strength\t: "+baseStr+"\t"+mHstr+"\t"+baseStr+mHstr);
        System.out.println("Defense \t: "+baseDef+"\t"+mHdef+"\t"+baseDef+mHdef);
        System.out.println("Dexterity\t: "+baseDex+"\t"+mHdex+"\t"+baseDex+mHdex);
    }
}
