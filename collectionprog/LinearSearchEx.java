package collectionprog;

public class LinearSearchEx {

    public static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 80;
        int index = linearSearch(arr, target);
        if(index != -1)
            System.out.println("found at index= " + index);
        else System.out.println("not found");
    }
}
/*
 * TIME COMPLEXITY
 * best case => i==0 => O(1)
 * average case => O(n)
 * worst case => O(n)
 */