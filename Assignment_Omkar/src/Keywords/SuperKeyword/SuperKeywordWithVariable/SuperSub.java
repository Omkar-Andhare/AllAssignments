package Keywords.SuperKeyword.SuperKeywordWithVariable;

public class SuperSub extends SuperBase {
    String str = "i am sub class variable";
    public void printSuperBaseVariable() {
        System.out.println(super.str);
    }

    public static void main(String[] args) {
        SuperSub sub = new SuperSub();
        sub.printSuperBaseVariable();
    }
}
