public class Bow extends Range{
    protected int ammo,maxAmmo;
    public Bow(String name,int level,int ammocapa){
        this.name = name;
        this.level = level;
        this.baseStr = 1;
        this.baseDef = 1;
        this.baseDex = 4;
        this.type = "Bow";
        this.maxAmmo= ammocapa;
        this.ammo = maxAmmo;
        updateStats();
    }
    public int getAmmo() {
        return ammo;
    }
    public int getMaxAmmo(){return maxAmmo;}
}
