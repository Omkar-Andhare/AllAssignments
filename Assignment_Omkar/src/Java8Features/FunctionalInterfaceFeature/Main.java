package Java8Features.FunctionalInterfaceFeature;

public class Main {
    public static void main(String[] args) {
        IDemo iDemo = new DemoImpl();
        iDemo.msg("Keep Consistency");
    }
}
