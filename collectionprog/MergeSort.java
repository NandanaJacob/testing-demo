package collectionprog;

import java.util.Arrays;

public class MergeSort {
    // Merge Sort implementation
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // Base case
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i]; 
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < left.length) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 1};
        mergeSort(arr);
        for(int num : arr){
            System.out.print("\t"+num);
        }
        System.out.println();
        //my sample
        int[] arr2 = {22, 76, 43, 50, 1};
        mergeSort(arr2);
        for(int num : arr2){
            System.out.print("\t"+num);
        }
    }

}
