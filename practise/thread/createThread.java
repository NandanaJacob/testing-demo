package practise.thread;
class EmployeeThread implements Runnable{
    String name;
    int id;
    int salary;
    public EmployeeThread(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void run(){
        System.out.println(name + " of id " + " is working rn for salary " + salary);
    }
}
public class createThread {
    public static void main(String[] args) {
        EmployeeThread emp1 = new EmployeeThread("nandana", 246, 40000);
        EmployeeThread emp2 = new EmployeeThread("tilaka", 389, 300000);
        Thread t1 = new Thread(emp1);
        Thread t2 = new Thread(emp2);
        t1.start();
        t2.start();
    }
}
