package Java8Features.FunctionalInterfaceFeature;

public class DemoImpl implements IDemo {
    @Override
    public void msg(String msg) {
        System.out.println("Hi this is implementation of functional interface IDemo and msg is :" + msg);
    }


}
