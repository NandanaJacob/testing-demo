import java.util.Scanner;
public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "nandana" , 200000);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getSal());
        //System.out.println(e1);
        //e1.toString();

        //read data frm user at runtime, use Scanner from java.util
        //=> import java.util.Scanner
        Scanner sc = new Scanner(System.in);
        //to recieve int vale
        int id = sc.nextInt();
        String name = sc.next();
        int sal = sc.nextInt();
        Employee e2 = new Employee(id, name, sal);
        //System.out.println(e2);
        System.out.println(e2.getId());
        System.out.println(e2.getName());
        System.out.println(e2.getSal());

        //________________________________________________________________
        //read multiple employees from user
        Employee e[] = new Employee[3];
		
		for(int i=0;i<e.length;i++)
		{
            System.out.println("Enter for employee " + i);
		    int no = sc.nextInt();
		    String ename = sc.next();
		    int salary = sc.nextInt();
			
		    e[i]=new Employee(no,ename,salary);
		}
		
		for(int i=0;i<e.length;i++)
		System.out.println(e[i]);

        sc.close();
    }
}
