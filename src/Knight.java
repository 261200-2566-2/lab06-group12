public class Knight extends MeleeCharacter{
    //constructor

    /**
     * Private constructor for Knight class (without main hand weapon) assign variables to object's class
     * effects: setting up base stat of a Knight. update stats, set born
     *          set job to "Knight"
     * @param name String Knight's name
     * @param level Knight's level
     *              a positive integer
     */
    private Knight(String name,int level){
        this.name = name;
        this.level = level;
        baseStr = 5;
        baseDef = 3;
        baseDex = 1;
        updateStats();
        born();
        job = "Knight";
    }

    /**
     * Constructor for Knight class (with main hand weapon)
     * effects: set(deep copy) main hand sword
     * @param name String Knight's name
     * @param level Knight's level
     *              a positive integer
     * @param mainHand main hand weapon which is Sword class
     */
    public Knight(String name,int level,Sword mainHand){
        this(name,level);
        this.mainHand = new Sword(mainHand.getName(), mainHand.getLevel());
        updateStats();
    }

    /**
     * Show Knight stats (with main hand parameter)
     */
    public void statsDisplay(){
        statsDisplays(mainHand.getName(), mainHand.type, mainHand.getLevel(), mainHand.getStr(),
                mainHand.getDef(), mainHand.getDex());
        System.out.println();
    }
}
