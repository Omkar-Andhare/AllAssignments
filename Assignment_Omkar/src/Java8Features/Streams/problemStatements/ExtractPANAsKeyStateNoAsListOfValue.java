package Java8Features.Streams.problemStatements;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtractPANAsKeyStateNoAsListOfValue {
    public static void main(String[] args) {
        List<String> gstinNumbers = Arrays.asList("27OMK171717171700", "26NIK919191919121", "45OPO202020202054");


        //exctract pan no as key, and starting 2 digit and ending 2 digit store value as list of that pan
        Map<String, List<String>> panAndNumbersMap = gstinNumbers.stream()
                .collect(Collectors.toMap(
                        gstin -> extractPanNo(gstin),
                        gstin -> Arrays.asList(gstin.substring(0, 2), gstin.substring(gstin.length() - 2))
                ));

        // Printing the pan as key and that two number list as value
        panAndNumbersMap.forEach((pan, numbers) -> System.out.println("PAN:🤑 " + pan + ", Numbers:🤗 " + numbers));
    }

    // extracting Pan no only
     static String extractPanNo(String gstin) {
        return gstin.substring(2, 12);
    }
}
