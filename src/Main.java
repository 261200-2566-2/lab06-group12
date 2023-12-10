// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Sword b1 = new Sword("Triple A",10);
//        b1.statsDisplay();
        Knight a1 = new Knight("MIM",4,b1);
        Knight a2 = new Knight("WIM",1,b1);
        a1.statsDisplay();
        a1.attack(a2);
        Bow c3 = new Bow("Grunge",10,3);
        c3.upLevel();
        c3.upLevel(2);
        Archer a3 = new Archer("Kijm",2,c3);
        a3.statsDisplay();
        a3.attack(a2);
        System.out.println("\nAccessory test");
        Ring ring1 = new Ring("Fire Ring",1,1,1);
        Glove glove = new Glove("Gauntlet", 3,3,3);
        a2.statsDisplay();
        a2.setRingSlot1(ring1);
        a2.setRingSlot2(ring1);
        a2.setGlove(glove);
        ring1.statsDisplay();
        a2.heal();
        a2.statsDisplay();
        System.out.println("Bow with ammo test");
        a3.statsDisplay();
        a3.attack(a2);
        a3.attack(a2);

        a3.attack(a2);
        a3.reload();
        a3.attack(a2);
    }
}