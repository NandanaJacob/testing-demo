package solid;

// Singleton pattern
 
public class SingletonEx {
 
	private static final SingletonEx instance = new SingletonEx();
	private SingletonEx()
	{
	}
	public static SingletonEx getInstance()
	{
		return instance;
	}
	public void showMessage()
	{
		System.out.println("Singleton instance invoked");
	}
    
}