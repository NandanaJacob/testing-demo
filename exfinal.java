class Emp // cannot be inherited
{
	final int eno=10;
	final void empInfo() // cannot be overridden
	{
		
	}
}
 
class Dept extends Emp
{
	int deptno;
	void deptInfo()
	{
		//eno=20;
		System.out.println("Employee number is : "+eno);
	}
	
}
public class exfinal {
 
	public static void main(String[] args) {
		Dept d = new Dept();
		d.deptInfo();
	}
	
}
