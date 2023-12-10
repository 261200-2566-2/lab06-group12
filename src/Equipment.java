public abstract class Equipment {
    //fields
    protected String name;
    protected int str,dex,def;
    //methods

    /**
     * Getter for Equipment's name
     * @return Equipment's name
     */
    public String getName() {
        return name;
    }
    /**
     * Getter for Equipment's strength
     * @return Equipment's strength
     */
    public int getStr(){return str;}
    /**
     * Getter for Equipment's dexterity
     * @return Equipment's dexterity
     */
    public int getDex(){return dex;}
    /**
     * Getter for Equipment's defense
     * @return Equipment's defense
     */
    public int getDef() {return def;}

    /**
     * Show Equipment's stat
     */
    public abstract void statsDisplay();
}