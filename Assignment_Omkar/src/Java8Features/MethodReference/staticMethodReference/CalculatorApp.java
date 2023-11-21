package Java8Features.MethodReference.staticMethodReference;

public class CalculatorApp {
    public static void main(String[] args) {
        // Using a lambda expression
        IMathOperation additionLambda = (a, b) -> a + b;

        // Using a method reference to a static method
        IMathOperation additionReference = MathUtils::add;

        // Applying the operations
        System.out.println("Lambda Result (Addition): " + additionLambda.operate(5, 3));
        System.out.println("Method Reference Result (Addition): " + additionReference.operate(5, 3));

        IMathOperation subLambda = (a, b) -> a + b;

        // Using a method reference to a static method
        IMathOperation subReference = MathUtils::add;

        // Applying the operations
        System.out.println("Lambda Result (sub): " + subLambda.operate(5, 3));
        System.out.println("Method Reference Result (sub): " + subReference.operate(5, 3));


    }
}
