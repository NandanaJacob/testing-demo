package excepprogs;

public class Excep1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] c = new int[5];

        // Handling exceptions using try, catch, and finally
        try {
            // Attempting to access an invalid index in the array
            try {
                System.out.println(c[7]); // This will cause an ArrayIndexOutOfBoundsException
                System.out.println("Inside inner try");
            } catch (ArrayIndexOutOfBoundsException ai) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + ai);
            }

            // Attempting to divide by zero
            System.out.println(a / b); // This will cause an ArithmeticException
            System.out.println("Inside outer try");
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException caught: " + ae);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("From finally block");
        }

        System.out.println("After Exception");

        // Example of a method that throws an exception
        try {
            methodThatThrows();
        } catch (Exception e) {
            System.out.println("Exception caught from methodThatThrows: " + e);
        }
    }

    // Method that declares that it throws an exception
    public static void methodThatThrows() throws Exception {
        throw new Exception("This is a thrown exception");
    }
}

/*package excepprogs;
 
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