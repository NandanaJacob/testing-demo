package ioprogs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleEx {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name?");
        String name = reader.readLine();
        System.out.println("Welcome "+name); 

        //int data = System.in.read(); //reads int type
        //System.out.println("Welcome "+(char)data); //prints 1 char only
        
        //thats y we use readLine => takes multiple bytes of data
        //thats y we use bufferedreader classs
        //if u wanna take formatted details u use scanner class
        //but for LARGE amnt of data, use bufferedreader class
    }
}
