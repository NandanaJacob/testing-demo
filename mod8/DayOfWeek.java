package mod8;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number (1-7) representing a day of the week:");
        System.out.print("1 for Monday, 2 for Tuesday, ..., 7 for Sunday: ");
        
        int dayNumber = scanner.nextInt();
        String dayName = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid input! Please enter a number between 1 and 7.";
        };

        System.out.println("Day of the week: " + dayName);
        scanner.close();
    }
}
