public class Glove extends Accessory{
    protected int hpInc;
    public Glove(String name, int str, int dex, int def) {
        super(name, str, dex, def);
        hpInc = (str*2)+dex+def;
    }
    public void statsDisplay() {
        System.out.println("Glove's Stats");
        System.out.println("Name : "+name);
        System.out.println("Strength point\t: "+str);
        System.out.println("Defense point \t: "+def);
        System.out.println("Dexterity point\t: "+dex);
        System.out.println("Altogether increase Health "+hpInc);
    }
    @Override
    protected int passiveStat() {   //Ring add mp
        return hpInc;
    }
}
