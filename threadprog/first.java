package threadprog;

class MyThread extends Thread{
    String s = null;
    MyThread(String s1){
        s = s1;
        start();
    }
    //resource
    public void run(){
        System.out.println(s);
    }
}
public class first {
    public static void main(String[] args) {
        MyThread m1 = new MyThread("Thread started");
        //m1.run();
    }
}
