package DependencyInjection;

public class ConcreteDependency implements IDependency {
    @Override
    public void M1() {
        System.out.println("Doing something in ConcreteDependency.");
    }
}
