class DivideByZeroException extends Exception
{
    public void Disp(){
        System.out.println("Divide by zero!!");
    }
}
public class FixCatch 
{ 
	public static void main(String[] args) 
	{ 
		int numerator = 10; 
		int denominator = 0; 
		// TODO: Implement exception handling for divide by zero 
        try{
            if(denominator==0){
                throw new DivideByZeroException();
            }
		    int result = divideNumbers(numerator, denominator); 
		    System.out.println("Result: " + result); 
        }catch(DivideByZeroException d){
            d.printStackTrace();
            d.Disp();
        }finally{
            System.out.println("in finally block");
        }
	} 
	private static int divideNumbers(int numerator, int denominator) 
	{ 
		// TODO: Implement exception handling for divide by zero 
		return numerator / denominator; 
	} 
}

