package StringSearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;

public class TimeSearch {
    public static String readFileAsString(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
    public static void main(String[] args) {
        try {
            // Read the text and pattern from files
            String innocentText = readFileAsString("innocent_text.txt");
            String hiddenMessage = readFileAsString("message_to_find.txt");

            // Perform Naive Search
            Boolean isPresent = innocentText.indexOf(hiddenMessage) != -1 ? true : false;
            if(isPresent){
                System.out.println("Is present.");
            }else{
                System.out.println("Not present.");
            }
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
        String strS = "welcomehome";
        String strC = "come";

        //start time
        Instant start = Instant.now();
        String outputStart = start.toString();
        System.out.println("started search at: ");
        System.out.println(outputStart);
        //check if string present
        Boolean isPresent = strS.indexOf(strC) != -1 ? true : false;
        if(isPresent){
            System.out.println("Is present.");
        }else{
            System.out.println("Not present.");
        }

        //end time
        Instant end = Instant.now();
        String outputEnd = end.toString();
        System.out.println("search ended at: ");
        System.out.println(outputEnd);

        //time elapsed
        System.out.println("Time elapsed: "+ Duration.between(start, end).toMillis() + " milliseconds");

        String str = "Hello";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println("length = " + str.length());
        System.out.println("char at 3rd index = " + str.charAt(2));
        System.out.println(str.substring(1, 4));
    }
}
