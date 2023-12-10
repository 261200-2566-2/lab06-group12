public class Weapon extends Equipment{
    //fields
    protected int baseStr;
    protected int baseDex;
    protected int baseDef;
    protected int level;
    protected String type;
    //constructor

    /**
     * Constructor for no weapon (bare hand). every stats set to zero
     */
    public Weapon(){
        this.name = "Bare Hand";
        this.level = 0;
        this.baseStr = 0;
        this.baseDef = 0;
        this.baseDex = 0;
        this.type = "Bare Hand";
    }

    /**
     * Getter for Weapon's level
     * @return Weapon's level
     */
    public int getLevel() {return level;}

    /**
     * Up level weapon
     * effects: increase the weapon's level by 1
     */
    public void upLevel(){upLevel(1);}

    /**
     * Up level Weapon with parameter
     * effects: increase the weapon's level with specified amount
     * @param lvl the amount by which to increase the level
     */
    public void upLevel(int lvl) {
        level+=lvl;
        updateStats();
    }

    /**
     * Updates the stats of the weapon
     * effects: updates the stats of the weapon based on its level and base stats.
     */
    protected void updateStats(){
        str = (int)(baseStr*level*0.8)+5;
        def = (int)(baseDef*level*0.5)+5;
        dex = (int)(baseDex*level*0.7)+5;
    }

    /**
     * Show Weapon's stat
     * effects: displays the stats of the weapon, including name, level, strength, defense, and dexterity.
     */
    public void statsDisplay() {
        System.out.println("\n"+type);
        System.out.println("Name\t: "+name+" level."+level);
        System.out.println("Strength\t: "+str);
        System.out.println("Defense \t: "+def);
        System.out.println("Dexterity\t: "+dex);
        System.out.println();
    }
}
