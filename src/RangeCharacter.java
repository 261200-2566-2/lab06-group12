public class RangeCharacter extends Character{
    protected Range mainHand;
    protected int calculateDmg() {
        return calculateDmg(mainHand.getStr(), mainHand.getDex());
    }
    protected int calculateDef() {
        return calculateDef(mainHand.getDef(), mainHand.getStr());
    }
    public void attack(Character target){
        if(mainHand instanceof Bow) {
            if(((Bow) mainHand).getAmmo()>0) {
                System.out.println(name + " Shoot " + target.getName() + " with his/her " + mainHand.getName() + " " + mainHand.type);
                System.out.println("Current Arrow(s) : "+((Bow) mainHand).getAmmo()+"/"+((Bow) mainHand).getMaxAmmo());
                System.out.println("Damage " + calculateDmg());
                target.beingAttack(calculateDmg());
            }else System.out.println("Out of ammo");
        }
    }
}
