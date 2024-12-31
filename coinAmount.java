import java.util.Scanner;
//import java.util.Arrays;

public class coinAmount {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        int amount = Integer.parseInt(userInput);

        java.util.Arrays.sort(coins);
        
        // Reverse the sorted array to make it descending
        for (int i = 0; i < coins.length / 2; i++) {
            int temp = coins[i];
            coins[i] = coins[coins.length - 1 - i];
            coins[coins.length - 1 - i] = temp;
        }

        StringBuilder usedCoins = new StringBuilder();
        boolean possible = false;

        for (int coin : coins) {
            System.out.println("looking at " + coin);
            if (amount >= coin) {
                System.out.println("Taking " + coin);
                amount -= coin; // Subtract coin value from the amount
                usedCoins.append(coin).append(" "); // Add the coin to the used list
            }
            if (amount == 0) {
                possible = true;
                break; // If amount becomes 0, stop further processing
            }
        }
        if (possible == true) {
            System.out.println("The coins used to make the amount are: " + usedCoins);
            System.out.println("It's possible to make the amount.");
        } else {
            System.out.println("It's not possible to make the exact amount with these coins.");
        }

        scanner.close();
    }
}
