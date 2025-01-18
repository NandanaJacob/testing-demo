package collectionprog;

public class BinarySearchEx {

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while( left <= right){
            int mid = left + (right - left / 2);
            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 50;
        int index = binarySearch(arr, target);
        if(index != -1)
            System.out.println("found at index= " + index);
        else System.out.println("not found");
    }
}
/*
works on sorted arrays
 * TIME COMPLEXITY
 * best case => i==0 => O(1)
 * average case => O(log(n))
 * worst case => O(log(n))
 * 
 * if unsorted array and small array => linear search
 * if sorted array and big array => binary search
 */