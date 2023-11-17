package GenericPractice.TypeParameter.MethodDeclaration;

public class Demo {
    // Generic method declaration
    public <T> void GenericMethodSingleParameter(T parameter) {
        System.out.println("This is Generic method with single parameter i.e.: " + parameter);
    }

    // Another generic method with multiple parameters
    public <T, U> void GenericMethodMultipleParameter(T param1, U param2) {

        System.out.println("This is Generic method with multiple parameter and parameters are : " + param1 + "," + param2);
    }

    // Generic method with a upper bounded type parameter
    public <T extends Number> double calculateSquare(T number) {
        return number.doubleValue() * number.doubleValue();
    }
}
