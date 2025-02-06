package solid;

//Dependency Inversion Principle
 
interface NotificationService
{
	void sendNotification(String message);
}
 
class Email implements NotificationService
{
	public void sendNotification(String message)
	{
		System.out.println("Sending Email : "+ message);
	}
}
class SMS implements NotificationService
{
	public void sendNotification(String message)
	{
		System.out.println("Sending SMS : "+ message);
	}
}
 
class userService
{
	private final NotificationService notificationService;
	public userService(NotificationService notificationService)
	{
		this.notificationService = notificationService;
	}
	public void notifyUser(String message)
	{
		notificationService.sendNotification(message);
	}
 
}
public class DipEx {
 
	public static void main(String[] args) {
		userService us = new userService(new SMS());
		us.notifyUser("Auto generated message");
	}
}