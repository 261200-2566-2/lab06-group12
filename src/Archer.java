public class Archer extends RangeCharacter{
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
    public Archer(String name,int level,Bow mainHand){
        this(name,level);
        this.mainHand = new Bow(mainHand.getName(), mainHand.getLevel(),mainHand.maxAmmo);
        updateStats();
    }
    public void statsDisplay(){
        statsDisplays(mainHand.getName(), mainHand.type, mainHand.getLevel(), mainHand.getStr(),
                mainHand.getDef(), mainHand.getDex());
        System.out.println();
    }
}
