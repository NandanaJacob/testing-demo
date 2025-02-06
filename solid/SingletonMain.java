package solid;

public class SingletonMain {
 
    public static void main(String[] args) {
            SingletonEx se = SingletonEx.getInstance();
            se.showMessage();
        }
    }