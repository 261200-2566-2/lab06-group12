public class MeleeCharacter extends Character{
    protected Melee mainHand;
    protected int calculateDmg() {
        return calculateDmg(mainHand.getStr(), mainHand.getDex());
    }
    protected int calculateDef() {
        return calculateDef(mainHand.getDef(), mainHand.getStr());
    }
    public void attack(Character target){
        System.out.println(name + " Attack "+target.getName()+" with his/her "+mainHand.getName()+" "+mainHand.type);
        System.out.println("Damage "+calculateDmg());
        target.beingAttack(calculateDmg());
    }
}
