public class Glove extends Accessory{
    //fields
    protected int hpInc;
    //constructor
    /**
     * Constructor for Glove class. call super constructor (Accessory)
     * effects: set health increase base on strength, defense, dexterity
     * @param name glove's name
     * @param str glove's strength
     * @param dex glove's dexterity
     * @param def glove's defense
     */
    public Glove(String name, int str, int dex, int def) {
        super(name, str, dex, def);
        hpInc = (str*2)+dex+def;
    }
    /**
     * Show Glove's stats
     */
    public void statsDisplay() {
        System.out.println("Glove's Stats");
        System.out.println("Name : "+name);
        System.out.println("Strength point\t: "+str);
        System.out.println("Defense point \t: "+def);
        System.out.println("Dexterity point\t: "+dex);
        System.out.println("Altogether increase Health "+hpInc);
    }

    /**
     * Getter for passive stat for glove which is health increase
     * @return health increase value
     */
    @Override
    protected int passiveStat() {   //Ring add mp
        return hpInc;
    }
}
