public class RangeCharacter extends Character{
    //fields
    protected Range mainHand;

    /**
     * Calculates the damage inflicted by the ranged character.
     * @return The calculated damage based on the ranged weapon's strength and dexterity.
     */
    protected int calculateDmg() {
        return calculateDmg(mainHand.getStr(), mainHand.getDex());
    }

    /**
     * Calculates the defense of the ranged character.
     * @return The calculated defense based on the ranged weapon's defense and strength.
     */
    protected int calculateDef() {
        return calculateDef(mainHand.getDef(), mainHand.getStr());
    }
    /**
     * Initiates an attack on the specified target using the ranged weapon.
     * Displays details such as character name, target's name, weapon used, ammo status, and damage inflicted.
     * effects: The target receives calculated damage.
     * @param target The target of the ranged attack (an instance of Character).
     */
    public void attack(Character target){
        if(mainHand instanceof Bow) {
            if(((Bow) mainHand).getAmmo()>0) {
                System.out.println(name + " Shoot " + target.getName() + " with his/her " + mainHand.getName() + " " + mainHand.type);
                System.out.println("Ammo -1");((Bow) mainHand).shoot();
                System.out.println("Current Arrow(s) : "+((Bow) mainHand).getAmmo()+"/"+((Bow) mainHand).getMaxAmmo());
                System.out.println("Damage " + calculateDmg());
                target.beingAttack(calculateDmg());
            }else System.out.println("Out of ammo");
        }
    }
    /**
     * Reloads the ammo for the ranged weapon (specifically for bows).
     * Displays a message if the reload is successful or indicates that reloading is not possible.
     */
    public void reload(){
        if(mainHand instanceof Bow){
            ((Bow) mainHand).reloadAmmo();
        }else{
            System.out.println("Can't reload");
        }
    }
}
