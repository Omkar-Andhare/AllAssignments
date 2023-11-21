package Java8Features.DefaultMethodFeature.BasicExample;

public interface IMyInterface {
    default void myDefaultMethod() {
        System.out.println("Default implementation of myDefaultMethod");
    }

    void myAbstractMethod();
}
