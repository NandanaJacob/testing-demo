package mod8;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class CharacterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> characterList = new ArrayList<>();  // List to store all created characters
        
        while (true) {
            System.out.println("\n--- Character Creation Menu ---");
            System.out.println("1. Create Warrior");
            System.out.println("2. Create Mage");
            System.out.println("3. Create Archer");
            System.out.println("4. Display All Characters");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            String choice = sc.nextLine().trim();

            if (choice.equals("5")) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case "1":
                    System.out.print("Enter character name: ");
                    String warriorName = sc.nextLine();
                    System.out.print("Enter character power: ");
                    int warriorPower = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter character wins: ");
                    int warriorWins = Integer.parseInt(sc.nextLine());
                    Character warrior = CharacterFactory.createCharacter("warrior", warriorName, warriorPower, warriorWins);
                    characterList.add(warrior);
                    System.out.println("Warrior created!");
                    break;

                case "2":
                    System.out.print("Enter character name: ");
                    String mageName = sc.nextLine();
                    System.out.print("Enter character power: ");
                    int magePower = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter character wins: ");
                    int mageWins = Integer.parseInt(sc.nextLine());
                    Character mage = CharacterFactory.createCharacter("mage", mageName, magePower, mageWins);
                    characterList.add(mage);
                    System.out.println("Mage created!");
                    break;

                case "3":
                    System.out.print("Enter character name: ");
                    String archerName = sc.nextLine();
                    System.out.print("Enter character power: ");
                    int archerPower = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter character wins: ");
                    int archerWins = Integer.parseInt(sc.nextLine());
                    Character archer = CharacterFactory.createCharacter("archer", archerName, archerPower, archerWins);
                    characterList.add(archer);
                    System.out.println("Archer created!");
                    break;

                case "4":
                    System.out.println("\n--- List of Created Characters ---");
                    if (characterList.isEmpty()) {
                        System.out.println("No characters created yet.");
                    } else {
                        for (Character character : characterList) {
                            System.out.println("Name: " + character.getName());
                            System.out.println("Power: " + character.getPower());
                            System.out.println("Wins: " + character.getWins());
                            System.out.println("----------");
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }
        }

        sc.close();
    }
}
