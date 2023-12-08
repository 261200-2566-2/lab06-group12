public class Weapon extends Equipment{
    protected int baseStr;
    protected int baseDex;
    protected int baseDef;
    protected int level;
    protected String type;
    public Weapon(){
        this.name = "Bare Hand";
        this.level = 0;
        this.baseStr = 0;
        this.baseDef = 0;
        this.baseDex = 0;
        this.type = "Bare Hand";
    }
    public int getLevel() {return level;}
    public void upLevel(){upLevel(1);}
    public void upLevel(int lvl) {
        level+=lvl;
        updateStats();
    }
    protected void updateStats(){
        str = (int)(baseStr*level*0.8)+5;
        def = (int)(baseDef*level*0.5)+5;
        dex = (int)(baseDex*level*0.7)+5;
    }
    public void statsDisplay() {
        System.out.println("\n"+type);
        System.out.println("Name\t: "+name+" level."+level);
        System.out.println("Strength\t: "+str);
        System.out.println("Defense \t: "+def);
        System.out.println("Dexterity\t: "+dex);
        System.out.println();
    }
}
