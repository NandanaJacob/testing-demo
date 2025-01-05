package excepprogs;
 
public class Excep1 {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
        int[] c = new int[5];
		
        //note that for every single possible error, u need a seperate catch block
		try
		{
			try{
        		System.out.println(c[7]);
				System.out.println("Inside inner try");
			}
			catch(ArrayIndexOutOfBoundsException ai){
				System.out.println(ai);
			}
			System.out.println(a/b);
			System.out.println("Inside outer try");
		}
        //catch(Exception e)
        //catch(ArithmeticException|ArrayIndexOutOfBoundsException ae)
        //{
        //    System.out.println(ae);
        //} 
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
            
		finally{
			System.out.println("from finally block");
		}
		
		System.out.println("After Exception");
	}
 
}
 
 
/*Exception
 
try , catch , finally , throw , throws
 
checked(FileNotFound) unchecked(ArithmeticException)
 
		Throwable
Exception		Error
	
 
*/