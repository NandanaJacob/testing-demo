package practise.mod6;

import java.util.Arrays;

public class binarysearch {
    public static int bin_search(int[] arr, int start, int end, int data){
        if (start > end) {
            System.out.println("Data not found");
            return -1;  // Return -1 if the data is not found
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == data){
            System.out.println("data found at index " + mid);
            return mid;
        }
        if(data<arr[mid]){
            return bin_search(arr, start, mid-1, data);
        }
        else{
            return bin_search(arr, mid+1, end, data);
        }
    }
    public static void main(String[] args) {
        int[] arr = {32, 12, 45, 2, 50};
        Arrays.sort(arr);
        int find = 32;
        int find2 = 100;
        int index_yes = bin_search(arr, 0, arr.length-1, find);
        int index_no = bin_search(arr, 0, arr.length-1, find2);
    }
}
