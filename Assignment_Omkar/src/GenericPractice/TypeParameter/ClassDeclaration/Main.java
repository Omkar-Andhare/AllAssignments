package GenericPractice.TypeParameter.ClassDeclaration;

import GenericPractice.TypeParameter.ClassDeclaration.Cupboard;

public class Main {
    public static void main(String[] args) {
        // Creating a Cupboard with Integer content
        Cupboard<Integer> intCupboard = new Cupboard<>(100);

        // Creating a Cupboard with String content
        Cupboard<String> stringCupboard = new Cupboard<>("String 1");

        // Displaying contents of the boxes
        intCupboard.displayCupboardContents();
        stringCupboard.displayCupboardContents();

        // Changing contents of the boxes
        intCupboard.setContent(200);
        stringCupboard.setContent("String 2");

        // Displaying updated contents
        intCupboard.displayCupboardContents();
        stringCupboard.displayCupboardContents();
    }
}
