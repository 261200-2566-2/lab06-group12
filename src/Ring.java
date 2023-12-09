public class Ring extends Accessory{
    protected int manaInc;
    public Ring(String name, int str, int dex, int def) {
        super(name, str, dex, def);
        manaInc = str+(dex*2)+def;
    }
    public void statsDisplay() {
        System.out.println("Ring's Stats");
        System.out.println("Name : "+name);
        System.out.println("Strength point\t: "+str);
        System.out.println("Defense point \t: "+def);
        System.out.println("Dexterity point\t: "+dex);
        System.out.println("Altogether increase Mana point "+manaInc);
    }
    @Override
    protected int passiveStat() {   //Ring add mp
        return manaInc;
    }
}
