package excepprogs;
 
public class Excep1 {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
        int[] c = new int[5];
		
        //note that for every single possible error, u need a seperate catch block
		try
		{
		System.out.println(a/b);
        System.out.println(c[7]);
		System.out.println("Inside try");
		}
        //catch(Exception e)
        catch(ArithmeticException|ArrayIndexOutOfBoundsException ae)
        {
            System.out.println(ae);
        }
        /* 
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
        catch(ArrayIndexOutOfBoundsException ai)
        {
            System.out.println(ai);
        }
            */
		
		System.out.println("After Exception");
	}
 
}
 
 
/*Exception
 
try , catch , finally , throw , throws
 
checked(FileNotFound) unchecked(ArithmeticException)
 
		Throwable
Exception		Error
	
 
*/