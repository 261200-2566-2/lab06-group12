public class Archer extends RangeCharacter{
    //Constructor

    /**
     * private constructor for Archer class assign value to object variables
     * effects: assign name, level. set up base stats for archer
     *          call updateStats(). call born to setting up hp, alive.
     *          set job to "Archer"
     * @param name name of archer object
     * @param level level of archer object
     */
    private Archer(String name,int level){
        this.name = name;
        this.level = level;
        baseStr = 5;
        baseDef = 3;
        baseDex = 1;
        updateStats();
        born();
        job = "Archer";
    }

    /**
     * Constructor for Archer class
     * effects: call private constructor. deep copy bow into new object
     * @param name name of archer object
     * @param level level of archer object
     * @param mainHand Bow as main hand weapon
     */
    public Archer(String name,int level,Bow mainHand){
        this(name,level);
        this.mainHand = new Bow(mainHand.getName(), mainHand.getLevel(),mainHand.maxAmmo);
        updateStats();
    }

    /**
     * Show every stat of an Archer
     * effects: call statsDisplays with main hand attributes
     */
    public void statsDisplay(){
        statsDisplays(mainHand.getName(), mainHand.type, mainHand.getLevel(), mainHand.getStr(),
                mainHand.getDef(), mainHand.getDex());
        System.out.println();
    }
}
