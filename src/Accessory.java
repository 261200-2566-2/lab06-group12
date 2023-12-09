public abstract class Accessory extends Equipment{
    public Accessory(String name,int str,int dex, int def){
        this.name = name;
        this.str = str;
        this.dex = dex;
        this.def = def;
    }
    protected abstract int passiveStat();
}
