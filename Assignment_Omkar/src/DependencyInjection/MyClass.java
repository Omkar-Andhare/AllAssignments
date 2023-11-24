package DependencyInjection;

public class MyClass {
     IDependency dependency;

    public void setDependency(IDependency dependency) {
        this.dependency = dependency;
    }

    public void performTask() {
        if (dependency != null) {
            dependency.M1();
        } else {
            System.out.println("IDependency not set. Cannot perform the task.");
        }
    }
}
