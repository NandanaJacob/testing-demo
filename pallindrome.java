import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);

        StringBuffer temp = new StringBuffer(userInput);
        StringBuffer rev = new StringBuffer(temp.reverse());
        System.out.println("Reverse is: " + rev);
        String str = new String(rev);

        //if(rev==temp)
        if(userInput.hashCode()==str.hashCode())
        {
            System.out.println("It is a pallindrome");
        }
        else{
            System.out.println("NOT a pallindrome");
        }

        scanner.close();
    }
}
