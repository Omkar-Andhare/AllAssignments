package DependencyInjection;

public class SetterInjectionExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        IDependency concreteDependency = new ConcreteDependency();

        myClass.setDependency(concreteDependency);

        myClass.performTask();
    }
}
