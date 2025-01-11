package threadprog;
class MyThread extends Thread{
    //class MyThread implements Runnable{
        String s = null;
        Thread t;
        MyThread(String s1){
            super(s1); //calls parameterized constructor of thread class
            start();
        }
        //resource
        public void run(){
            // for(int i=0; i<5; i++){
            //     System.out.println("Thread name: " + Thread.currentThread().getName());
            
                try {
                    for(int i=0; i<5; i++)
                    {
                        System.out.println("Thread name: " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Exit from: " + getName());
            //}
        }
    }
    public class first {
        public static void main(String[] args) {
            System.out.println("Thread name: " + Thread.currentThread().getName());
            //thread object
            MyThread m1 = new MyThread("Thread started...1");
            MyThread m2 = new MyThread("Thread started...2");
            MyThread m3 = new MyThread("Thread started...3");
            // m1.setPriority(Thread.MAX_PRIORITY);
            // m2.setPriority(Thread.MIN_PRIORITY);
            // m3.setPriority(Thread.NORM_PRIORITY);
            try{
                System.out.println("Waiting for child thread to finish: " + Thread.currentThread().getName());
                m1.join();
                if(!m1.isAlive()){
                    System.out.println("m1 is dead");
                }
                m2.join();
                if(!m2.isAlive()){
                    System.out.println("m2 is dead");
                }
                m3.join();
                if(!m3.isAlive()){
                    System.out.println("m3 is dead");
                }
            }catch(Exception e){

            }
            System.out.println("Exit frm main method");
        }
    }
//_______________________________________________________________________________________
//MULTI THREADING EXAMPLE
//_______________________________________________________________________________________
// class MyThread extends Thread{
// //class MyThread implements Runnable{
//     String s = null;
//     Thread t;
//     MyThread(String s1){
//         //t = new Thread(this); //refers to current thread object
//         //s = s1;
//         //t.start();
//         //if class extends thread, simply start() was okay
//         super(s1); //calls parameterized constructor of thread class
//         start();
//     }
//     //resource
//     public void run(){
//         for(int i=0; i<5; i++){
//             System.out.println("Thread name: " + Thread.currentThread().getName());
        
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// public class first {
//     public static void main(String[] args) {
//         System.out.println("Thread name: " + Thread.currentThread().getName());
//         //thread object
//         MyThread m1 = new MyThread("Thread started...1");
//         MyThread m2 = new MyThread("Thread started...2");
//         MyThread m3 = new MyThread("Thread started...3");
//         //m1.run();
//         //without start() being implemented, directly if u used run(), its not part ofthread
//         //u need start() to actually start implementing smthing thats a thread
//         //otherwise its like run is simply the name of a method 
//         //once u did start(), this run() is overrideing actual run method of thread
//     }
// }
//_______________________________________________________________________________________
//IMPLEMENTS RUNNABLE for single thread
// package threadprog;
 
// class MyThread implements Runnable
// {
// 	String s=null;
// 	Thread t;
// 	MyThread(String s1)
// 	{
// 		s=s1;
// 		t=new Thread(this);    // refers the current object
// 		t.start();  // invoke the run
// 	}
	
// 	public void run()  // Runnable interface
// 	{
// 		System.out.println(s);
// 	}
// }
 
// public class first {
 
// 	public static void main(String[] args) {
		
// 		MyThread m1 = new MyThread("Thread started...");
// 		//m1.run();
// 	}
// }

//_______________________________________________________________________________________
//EXTENDS THREAD for single thread
// package threadprog;
 
// class MyThread extends Thread
// {
// 	String s=null;
// 	MyThread(String s1)
// 	{
// 		s=s1;
// 		start();  // invoke the run
// 	}
	
// 	public void run()  // Runnable interface
// 	{
// 		System.out.println(s);
// 	}
// }
 
// public class first {
 
// 	public static void main(String[] args) {
		
// 		MyThread m1 = new MyThread("Thread started...");
// 		//m1.run();
// 	}
// }