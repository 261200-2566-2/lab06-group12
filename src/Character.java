public abstract class Character extends BaseStats{
    //fields
    protected String name;
    protected boolean alive;
    protected Ring ringSlot1,ringSlot2;
    protected Glove glove;
    protected String job;

    //getter
    //methods

    /**
     * Getter for name
     * @return name of Character
     */
    public String getName() {return name;}

    /**
     * Calculate damage for attacker character
     * @param mhStr main hand strength
     *              a positive integer
     * @param mhDex main hand dexterity
     *              a positive integer
     * @return calculated damage base on character's strength, main hand's strength and dexterity
     */
    protected int calculateDmg(int mhStr,int mhDex){
        return mhStr*2+mhDex+str;
    }
    /**
     * Calculate defense for defender character
     * @param mhStr main hand strength
     *              a positive integer
     * @param mhDef main hand defense
     *              a positive integer
     * @return calculated defense base on character's defense, main hand's strength and defense
     */
    protected int calculateDef(int mhDef,int mhStr){
        return mhDef*2+mhStr+def;
    }

    /**
     * Overload of calculateDef(int,int) without parameter (waiting for main hand declaration)
     * @return calculated defense
     */
    protected abstract int calculateDef();
    /**
     * Overload of calculateDmg(int,int) without parameter (waiting for main hand declaration)
     * @return calculated damage
     */
    protected abstract int calculateDmg();

    /**
     * Perform when character being attacked
     * effects: checked damage, defense. show details about attack.
     *          decrease health.
     * @param dmg calculated damage
     */
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

    /**
     * Show stats of a character. show accessory's stat
     * @param mainHandName main hand weapon's name
     * @param mainHandClass character job/class
     * @param mHlvl main hand weapon's level
     * @param mHstr main hand weapon's strength
     * @param mHdef main hand weapon's defense
     * @param mHdex main hand weapon's dexterity
     */
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

    /**
     * Checked and show wearing accessory's stats.
     */
    protected void accessoryDisplay(){
        if(ringSlot1!=null) {System.out.println("Ring slot 1\t: " + ringSlot1.getName());}
        if(ringSlot2!=null) {System.out.println("Ring slot 2\t: " + ringSlot2.getName());}
        if(ringSlot1!=null||ringSlot2!=null) System.out.println("Extra mana\t: "+manaInc);
        if(glove!=null) {System.out.println("Glove slot 1 : " + glove.getName());
        System.out.println("Extra health\t: "+hpInc);}
    }

    /**
     * As character created setting stats up
     * effects: health, mana point, speed, alive status
     */
    protected void born(){
        hp=maxHp;
        mp=maxMp;
        sp=maxSp;
        alive = true;
    }

    /**
     * Heal a character to full health
     * effects: set health and mana point to its full capacity.
     *          show details
     */
    public void heal(){
        System.out.println();
        System.out.println(name + " heal . . .");
        hp = maxHp;
        mp = maxMp;
        System.out.println("Health\t: "+hp+"/"+maxHp);
        System.out.println("Mana\t: "+mp+"/"+maxMp);
        System.out.println();
    }

    /**
     * Setter for ring slot 1
     * effects: set ring slot 1 to input Ring and update stats
     * @param ringSlot1 Ring input variables
     */
    public void setRingSlot1(Ring ringSlot1) {
        this.ringSlot1 = ringSlot1;
        updateStats();
    }
    /**
     * Setter for ring slot 2
     * effects: set ring slot 2 to input Ring and update stats
     * @param ringSlot2 Ring input variables
     */
    public void setRingSlot2(Ring ringSlot2) {
        this.ringSlot2 = ringSlot2;
        updateStats();
    }
    /**
     * Setter for glove
     * effects: set glove to input Glove and update stats
     * @param glove Glove input variables
     */
    public void setGlove(Glove glove) {
        this.glove = glove;
        updateStats();
    }

    /**
     * Override of an updateStats() add update stat for accessories
     * effects: get passive stat out of accessories. update mana increase base on ring
     *          update health increase base on glove. update maxHp, maxMp
     */
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
