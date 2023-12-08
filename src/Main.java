// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Sword b1 = new Sword("Triple A",1);
//        b1.statsDisplay();
        Knight a1 = new Knight("MIM",4,b1);
        Knight a2 = new Knight("WIM",1,b1);
        a1.statsDisplay();
        a1.attack(a2);
    }
}