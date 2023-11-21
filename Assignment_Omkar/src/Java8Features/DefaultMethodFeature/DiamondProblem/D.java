package Java8Features.DefaultMethodFeature.DiamondProblem;

public class D implements IB, IC {
    public static void main(String[] args) {
        new D().method();
    }


    @Override
    public void method() {
        IB.super.method();
    }
}
