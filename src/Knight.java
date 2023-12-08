public class Knight extends MeleeCharacter{
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
    public Knight(String name,int level,Sword mainHand){
        this(name,level);
        this.mainHand = new Sword(mainHand.getName(), mainHand.getLevel());
        updateStats();
    }

    public void statsDisplay(){
        statsDisplays(mainHand.getName(), mainHand.type, mainHand.getLevel(), mainHand.getStr(),
                mainHand.getDef(), mainHand.getDex());
        System.out.println();
    }
}
