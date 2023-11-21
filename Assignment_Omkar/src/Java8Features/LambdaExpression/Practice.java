package Java8Features.LambdaExpression;

import java.util.function.Function;

public class Practice {

    public static void main(String[] args) {
        // Using lambda expression with Function interface to convert a String to its length
        Function<String, Integer> stringLengthFunction = (s) -> s.length();

//        Function<String, Integer> stringLengthFunction2 = Integer::;



        // Applying the function to get the length of a string
        String inputString = "Omkar Andhare";
        int length = stringLengthFunction.apply(inputString);

        // Printing the result
        System.out.println("Length of '" + inputString + "': " + length);
    }
}

