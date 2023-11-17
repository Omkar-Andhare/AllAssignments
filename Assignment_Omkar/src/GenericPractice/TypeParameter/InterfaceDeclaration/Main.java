package GenericPractice.TypeParameter.InterfaceDeclaration;

public class Main {
    public static void main(String[] args) {


        Pair<Integer, String> pair1 = new OrderedPair<>(1, "One");

        Pair<Integer, String> pair2 = new OrderedPair<>(2, "Two");

        System.out.println("Pair 1: Key=" + pair1.getKey() + ", Value=" + pair1.getValue());
        System.out.println("Pair 2: Key=" + pair2.getKey() + ", Value=" + pair2.getValue());
    }
}
