public class Bow extends Range{
    //fields
    protected int ammo,maxAmmo;
    //constructor
    /**
     * Constructor for Bow class assign value to object variables
     * effects: assign name, level, maxAmmo, ammo. set up base stats for Bow
     *          set type to "Bow". call updateStats()
     * @param name name of a Bow
     * @param level level of a Bow
     * @param ammoCapa ammo capacity of a bow
     */
    public Bow(String name,int level,int ammoCapa){
        this.name = name;
        this.level = level;
        this.baseStr = 1;
        this.baseDef = 1;
        this.baseDex = 4;
        this.type = "Bow";
        this.maxAmmo= ammoCapa;
        this.ammo = maxAmmo;
        updateStats();
    }

    /**
     * Shoot an arrow out
     * effects: decrease an ammo
     */
    public void shoot(){
        ammo--;
    }

    /**
     * Reload an arrow
     * effects: set ammo to its max ammo's capacity
     */
    protected void reloadAmmo(){
        ammo = maxAmmo;
    }

    /**
     * Getter for ammo
     * @return current ammo of Bow
     */
    public int getAmmo() {
        return ammo;
    }

    /**
     * Getter for maxAmmo
     * @return max ammo's capacity
     */
    public int getMaxAmmo(){return maxAmmo;}
}
