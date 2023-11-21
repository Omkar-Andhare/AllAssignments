package Java8Features.DefaultMethodFeature.DiamondProblem;

public interface IC  extends  IA{
    default void method(){
        System.out.println("C");
    }
}
