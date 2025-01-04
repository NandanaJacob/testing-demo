public class InterAdapter implements inter2, inter1
{
	public static void main(String[] args) {
		inter2 n1;
		n1 = new InterAdapter();
		//n1.method4(); ====> could be done in 1.8 version of java or smthing

	}
 
	@Override
	public void method1() {
		System.out.println("method1");
		
	}
 
	public void method3() {
		System.out.println("method3");
		
	}
 
	@Override
	public void method2() {
		System.out.println("method2");
		
	}
 
}
 

