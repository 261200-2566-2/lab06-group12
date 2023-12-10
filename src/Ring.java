public class Ring extends Accessory{
    protected int manaInc;
    /**
     * Constructor for the Ring class.
     * @param name The name of the ring.
     * @param str Strength points.
     * @param dex Dexterity points.
     * @param def Defense points.
     */
    public Ring(String name, int str, int dex, int def) {
        super(name, str, dex, def);
        manaInc = str+(dex*2)+def;
    }
    /**
     * Displays the stats of the ring, including name, strength, defense, dexterity, and mana increase.
     */
    public void statsDisplay() {
        System.out.println("Ring's Stats");
        System.out.println("Name : "+name);
        System.out.println("Strength point\t: "+str);
        System.out.println("Defense point \t: "+def);
        System.out.println("Dexterity point\t: "+dex);
        System.out.println("Altogether increase Mana point "+manaInc);
    }
    /**
     * Override method to represent the passive effect of the ring, which adds to the character's mana points.
     * @return The amount of mana increase provided by the ring.
     */
    @Override
    protected int passiveStat() {   //Ring add mp
        return manaInc;
    }
}
