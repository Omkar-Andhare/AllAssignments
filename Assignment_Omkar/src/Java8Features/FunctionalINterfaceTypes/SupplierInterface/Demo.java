package Java8Features.FunctionalINterfaceTypes.SupplierInterface;

import java.util.Random;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
        int randomNumber = randomNumberSupplier.get();
        System.out.println("Random number is " + randomNumber);
    }
}
