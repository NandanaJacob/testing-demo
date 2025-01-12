package ioprogs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStream {
    public static void main(String[] args) {
        File f = new File("data.txt");
        try{
        // FileInputStream fin = new FileInputStream(f); //to read from data1
        // FileOutputStream fout = new FileOutputStream("data2.txt"); //to write to data2

        FileReader fin = new FileReader(f); //to read from data1
        FileWriter fout = new FileWriter("data2.txt"); //to write to data2

        //read how many bytes in data.txt
        //System.out.println(fin.available());
        fin.skip(7);
        int i=0;
        while((i=fin.read())!=-1){
            fout.flush();
            System.out.println((char)i);
            fout.write(i);
        }
        fin.close();
        fout.close();
        }catch(IOException e){

        }
    }

}
