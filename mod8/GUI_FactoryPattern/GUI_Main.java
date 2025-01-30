package mod8.GUI_FactoryPattern;

import java.util.Scanner;

public class GUI_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GUIFactory factory = null;
        Button button = null;
        TextField textField = null;

        while (true) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Light Theme");
            System.out.println("2. Dark Theme");
            System.out.println("3. Display Current Components");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    factory = new LightThemeFactory();  // Create Light Theme Factory
                    button = factory.createButton();  // Create Light Button
                    textField = factory.createTextField();  // Create Light TextField
                    System.out.println("Light theme selected.");
                    break;

                case 2:
                    factory = new DarkThemeFactory();  // Create Dark Theme Factory
                    button = factory.createButton();  // Create Dark Button
                    textField = factory.createTextField();  // Create Dark TextField
                    System.out.println("Dark theme selected.");
                    break;

                case 3:
                    if (button != null && textField != null) {
                        System.out.println("Displaying current components:");
                        button.render();
                        textField.render();
                    } else {
                        System.out.println("No theme selected yet. Please select a theme first.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;  

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }
        }
    }
}
