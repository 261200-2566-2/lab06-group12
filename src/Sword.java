public class Sword extends Melee{
    /**
     * Constructor for Sword class assign value to object variables
     * effects: assign name, level, maxAmmo, ammo. set up base stats for Sword
     *          set type to "Sword". update stats
     * @param name name of a Sword
     * @param level level of a Sword
     */
    public Sword(String name,int level){
        this.name = name;
        this.level = level;
        this.baseStr = 3;
        this.baseDef = 2;
        this.baseDex = 1;
        this.type = "Sword";
        updateStats();
    }
}
