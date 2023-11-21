package Java8Features.DefaultMethodFeature.DiamondProblem;

public interface IA {
    default void method(){
        System.out.println("A");
    }
}
