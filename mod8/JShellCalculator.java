package mod8;

import jdk.jshell.*;
import java.util.*;

public class JShellCalculator {
    // History to store expressions and their results
    private static final List<String> history = new ArrayList<>();
    private static final List<String> results = new ArrayList<>();

    public static void main(String[] args) {
        // Initialize JShell
        JShell jShell = JShell.create();
        Scanner scanner = new Scanner(System.in);

        // Ensure Math class is available
        jShell.eval("import java.lang.Math;");

        System.out.println("Welcome to the Enhanced JShell Calculator!");
        System.out.println("Enter a mathematical expression (or type 'exit' to quit):");

        while (true) {
            // Get user input
            String input = scanner.nextLine().trim();

            // Exit if the user types "exit"
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            // Show history if user requests
            if (input.equalsIgnoreCase("history")) {
                showHistory();
                continue;
            }

            // Handle variable usage: Check if the user is asking for a variable's value
            if (input.startsWith("print ")) {
                // print variable value
                String variable = input.substring(6).trim(); // Remove "print " prefix
                printVariable(jShell, variable);
                continue;
            }

            // Evaluate the input using JShell
            Iterable<SnippetEvent> events = jShell.eval(input);

            // Handle JShell events and display results
            boolean isValid = false;
            for (SnippetEvent event : events) {
                if (event.status() == jdk.jshell.Snippet.Status.VALID) {
                    // Store the valid expression and its result
                    String result = event.value();
                    history.add(input);
                    results.add(result);
                    System.out.println("Result: " + result);
                    isValid = true;
                    break;
                } else {
                    // Handle invalid expression
                    System.out.println("Invalid expression! Please try again.");
                    isValid = false;
                    break;
                }
            }

            if (!isValid) {
                System.out.println("Try again with a valid mathematical expression.");
            }
        }

        // Close the scanner and JShell instance
        scanner.close();
        jShell.close();
    }

    // Method to display history
    private static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No expressions in history.");
            return;
        }

        System.out.println("History of expressions:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". Expression: " + history.get(i) + " = " + results.get(i));
        }
    }

    // Method to print variable value
    private static void printVariable(JShell jShell, String variable) {
        String code = variable + ";"; // Just typing the variable will show its value
        Iterable<SnippetEvent> events = jShell.eval(code);
        for (SnippetEvent event : events) {
            if (event.status() == jdk.jshell.Snippet.Status.VALID) {
                System.out.println(variable + " = " + event.value());
                return;
            }
        }
        System.out.println("Variable '" + variable + "' not found.");
    }
}



// import jdk.jshell.*;
// import java.util.Scanner;

// public class JShellCalculator {
//     public static void main(String[] args) {
//         // Initialize JShell
//         JShell jShell = JShell.create();
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Welcome to the JShell Calculator!");
//         System.out.println("Enter a mathematical expression (or type 'exit' to quit):");

//         while (true) {
//             // Get user input
//             String input = scanner.nextLine();

//             // Exit if the user types "exit"
//             if (input.equalsIgnoreCase("exit")) {
//                 System.out.println("Exiting the program...");
//                 break;
//             }

//             // Evaluate the input using JShell
//             String jShellCode = input;
//             Iterable<SnippetEvent> events = jShell.eval(jShellCode);
            

//             // Handle JShell events and display results
//             boolean isValid = false;
//             for (SnippetEvent event : events) {
                
//                 if (event.status() == jdk.jshell.Snippet.Status.VALID) {
//                     // Display the result
//                     System.out.println("Result: " + event.value());
//                     isValid = true;
//                     break;
//                 } else {
//                     // Handle invalid expression
//                     System.out.println("Invalid expression! Please try again.");
//                     isValid = false;
//                     break;
//                 }
//             }

//             if (!isValid) {
//                 System.out.println("Try again with a valid mathematical expression.");
//             }
//         }

//         scanner.close();
//     }
// }
