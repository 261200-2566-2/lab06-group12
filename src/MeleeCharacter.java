public class MeleeCharacter extends Character{
    //fields
    protected Melee mainHand;

    /**
     * Calculate melee character's damage
     * @return calculated damage
     */
    protected int calculateDmg() {
        return calculateDmg(mainHand.getStr(), mainHand.getDex());
    }

    /**
     * Calculate melee character's defense
     * @return calculated defense
     */
    protected int calculateDef() {
        return calculateDef(mainHand.getDef(), mainHand.getStr());
    }

    /**
     * Melee character attack target show details(name, target's name, weapon)
     * effects: target get calculated damage
     * @param target Character class target
     */
    public void attack(Character target){
        System.out.println(name + " Attack "+target.getName()+" with his/her "+mainHand.getName()+" "+mainHand.type);
        System.out.println("Damage "+calculateDmg());
        target.beingAttack(calculateDmg());
    }
}
