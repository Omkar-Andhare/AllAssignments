package Java8Features.DefaultMethodFeature.DiamondProblem;

public interface IB extends IA {
    default void method(){
        System.out.println("B");
    }

}
