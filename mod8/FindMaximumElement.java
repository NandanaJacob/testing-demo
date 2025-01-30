package mod8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindMaximumElement {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(1.5, 2.8, 3.2, 2.0, 5.1);

        OptionalDouble max = doubles.stream()              
            .mapToDouble(Double::doubleValue)                
            .max();                                          

        if (max.isPresent()) {
            System.out.println("Maximum element: " + max.getAsDouble());
        } else {
            System.out.println("List is empty.");
        }
    }
}

