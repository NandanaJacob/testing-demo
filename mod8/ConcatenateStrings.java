package mod8;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import collectionprog.Map;

public class ConcatenateStrings {
    public static void main(String[] args) {
        // Given list of strings
        List<String> words = Arrays.asList("Java", "is", "fun", "with", "Streams");

        // Use Stream API to concatenate all strings with a space separator
        String result = words.stream()
                             .collect(Collectors.joining(" "));

        // Print the result
        System.out.println(result);

        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Use Stream API to group the strings by their length
        Map<Integer, List<String>> groupedByLength = words.stream()
                                                          .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength);
    }
}
