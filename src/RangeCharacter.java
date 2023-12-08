public class RangeCharacter extends Character{
    protected Range mainHand;
    protected int calculateDmg() {
        return calculateDmg(mainHand.getStr(), mainHand.getDex());
    }
    protected int calculateDef() {
        return calculateDef(mainHand.getDef(), mainHand.getStr());
    }
    public void attack(Character target){
        System.out.println(name + " Shoot/Throw "+target.getName()+" with his/her "+mainHand.getName()+" "+mainHand.type);
        System.out.println("Damage "+calculateDmg());
        target.beingAttack(calculateDmg());
    }
}
