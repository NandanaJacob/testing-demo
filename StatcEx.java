public class StatcEx {
    static int a=0;
    /*
     * if simply int a=0 => output is 1 1 1 1 1
     * if static int a = 0 => output is 1 2 3 4 5
     */
    void StaticEx(){
        System.out.println(++a);
    }
    public static void main(String[] args) {
        for(int i=0; i<5; i++)
        {
            StatcEx st = new StatcEx();
            st.StaticEx();
            System.out.println("static variable: "+a); //able to do this only cus a is static
            //otherwise u should use st.a
        }
    }
}
/* 
java.lang.System.*;
 
public class StaticEx { // Top level classes cannot be static
	
	//static int a=0;
	static class inner // inner class
	{
		
	}
	StaticEx()
	{
		out.println("Constructor");
	}
	static
	{
		out.println("I am static block");
	}
	
	void show()
	{
		out.println(Math.sqrt(4));
	}
	
	{
		out.println("I am a not-static block");
	}
	public static void main(String[] args) {
	
		System.out.println("I am main");
			StaticEx st = new StaticEx();
			st.show();
 
	}
}
 
has context menu
 */