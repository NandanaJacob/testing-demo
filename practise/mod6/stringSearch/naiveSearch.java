package practise.mod6.stringSearch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class naiveSearch {
    public static String ReadFileAsString(String FileName) throws IOException{
        return new String(Files.readAllBytes(Paths.get(FileName)));
    }
    public static int naiveSearchAlgo(String hidden, String tofind){
        int n = hidden.length();
        int m = tofind.length();
        int comparison = 0;
        for(int i=0; i<=n-m; i++){
            int j;
            comparison++;
            for(j=0; j<m; j++){
                if(hidden.charAt(i+j) != tofind.charAt(j)){
                    break;
                }
            }
            if(j == m){
                System.out.println("message found at index " + i);
                System.out.println("no. of comparisons done: " + comparison);
                return i;
            }
        }
        System.out.println("message not present.");
        return -1;
    }
    public static void main(String[] args) {
        try{
        String hidden = ReadFileAsString("innocent_text.txt");//message_to_find.txt
        String tofind = ReadFileAsString("message_to_find.txt");
        int index = naiveSearchAlgo(hidden, tofind);
        System.out.println("index = " + index);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
