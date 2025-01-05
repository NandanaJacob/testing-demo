import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
    public static boolean isLeapYear(int year) {
        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // Check if the year is divisible by 100
            if (year % 100 == 0) {
                // Check if the year is divisible by 400
                return (year % 400 == 0);
            } else {
                return true; // It is a leap year
            }
        }
        return false; // It is not a leap year
    }    
}
