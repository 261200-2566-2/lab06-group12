public abstract class Accessory extends Equipment{
    //Constructor

    /**
     * Constructor for Accessory class assign value to the object variables
     * @param name name of accessory
     * @param str strength
     * @param dex dexterity
     * @param def defense
     */
    public Accessory(String name,int str,int dex, int def){
        this.name = name;
        this.str = str;
        this.dex = dex;
        this.def = def;
    }

    /**
     *  Return passive stat(Health increase, Mana increase) base on Accessory type
     *  return: passive stat value
     */
    protected abstract int passiveStat();
}
