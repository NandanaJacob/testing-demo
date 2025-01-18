import java.util.Arrays;

public class KnapsackProblem {
    static class Item {
        int weight;
        int value;
        double ratio;  // value per unit weight
        int index;     // original position
        
        Item(int weight, int value, int index) {
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value / weight;
            this.index = index;
        }
    }
    
    static class TestCase {
        int[] weights;
        int[] values;
        int capacity;
        
        TestCase(int[] weights, int[] values, int capacity) {
            this.weights = weights;
            this.values = values;
            this.capacity = capacity;
        }
    }
    
    public static int knapsackDP(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i-1] <= w) {
                    dp[i][w] = Math.max(values[i-1] + dp[i-1][w-weights[i-1]], dp[i-1][w]);
                } else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        
        System.out.println("\nDP Solution Selected Items:");
        int w = capacity;
        int val = dp[n][capacity];
        for (int i = n; i > 0 && val > 0; i--) {
            if (val != dp[i-1][w]) {
                System.out.printf("Item %d (Weight: %d, Value: %d)\n", i-1, weights[i-1], values[i-1]);
                val -= values[i-1];
                w -= weights[i-1];
            }
        }
        
        return dp[n][capacity];
    }
    
    public static int knapsackGreedy(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        Item[] items = new Item[n];
        
        for (int i = 0; i < n; i++) {
            items[i] = new Item(weights[i], values[i], i);
        }
        
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        
        int totalValue = 0;
        int remainingCapacity = capacity;
        System.out.println("\nGreedy Solution Selected Items:");
        
        for (Item item : items) {
            if (item.weight <= remainingCapacity) {
                System.out.printf("Item %d (Weight: %d, Value: %d)\n", item.index, item.weight, item.value);
                totalValue += item.value;
                remainingCapacity -= item.weight;
            }
        }
        
        return totalValue;
    }
    
    public static void main(String[] args) {
        // Define test cases
        TestCase[] testCases = {
            new TestCase(new int[]{10, 20, 30}, new int[]{60, 100, 120}, 50),
            new TestCase(new int[]{2, 3, 4, 5}, new int[]{3, 4, 5, 6}, 8),
            new TestCase(new int[]{5, 10, 15, 20, 25}, new int[]{30, 40, 45, 50, 55}, 40)
        };
        
        for (int i = 0; i < testCases.length; i++) {
            System.out.println("\nTest Case " + (i + 1) + ":");
            System.out.println("Capacity: " + testCases[i].capacity);
            System.out.println("Items (Weight, Value):");
            int[] weights = testCases[i].weights;
            int[] values = testCases[i].values;
            
            for (int j = 0; j < weights.length; j++) {
                System.out.printf("Item %d: (%d, %d)\n", j, weights[j], values[j]);
            }
            
            int dpValue = knapsackDP(weights, values, testCases[i].capacity);
            int greedyValue = knapsackGreedy(weights, values, testCases[i].capacity);
            
            System.out.println("\nDP Solution Total Value: " + dpValue);
            System.out.println("Greedy Solution Total Value: " + greedyValue);
        }
    }
}
