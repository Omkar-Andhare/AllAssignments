package GenericPractice.TypeParameter.MethodDeclaration;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.GenericMethodSingleParameter(1000);
        demo.GenericMethodSingleParameter("Omkar");
        demo.GenericMethodMultipleParameter(1, "Perennial");

        System.out.println("square is : " + demo.calculateSquare(9));


    }
}
