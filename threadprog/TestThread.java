package threadprog;

class TwoStrings{
    synchronized static void printing(String str1, String str2){
        System.out.println(str1);
        try{
            Thread.sleep(500);
        }catch(Exception e){

        }
        System.err.println(str2);
    }
}

class PrintStringsThread implements Runnable{
    Thread thread;
    String str1, str2;
    //constructor
    public PrintStringsThread(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
        thread = new Thread(this);
        thread.start();
    }
    //run method
    public void run(){
        //twostrings class is gonna give details to print here
        TwoStrings.printing(str1, str2);
    }
}

public class TestThread {
    public static void main(String[] args) {
        new PrintStringsThread("Hello", "there");
        new PrintStringsThread("How are", "you");
        new PrintStringsThread("Thank you", "very much");
    }
}
