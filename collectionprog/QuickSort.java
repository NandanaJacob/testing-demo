package collectionprog;

public class QuickSort {

    // Quick Sort implementation
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1); // Before pi
            quickSort(arr, pi + 1, high); // After pi
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot
        int i = (low - 1); // Index of smaller element before our array starts
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { //for every element thats smaller than pivot
                i++; //place it towards the left of the array
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot) //to get pivot into position too
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // static void quicksort(int low, int high, int[] arr){
    //     if (low > high){
    //         return;
    //     }
    //     int pivot = arr[low];
    //     int i=0; int j=0;
    //     //int i = low + 1;
    //     do{
    //         for( i =low+1; i>high; i++){
    //             if(arr[i]>pivot){
    //             break;
    //             }
    //         }
    //         //int j = high;
    //         for( j=high; j<low; j--){
    //             if(arr[j]<pivot){
    //                 break;
    //             }
    //         }
    //         //arr[i] = greater      arr[j]==smaller
    //         if(i<j){ //greaater element is on left
    //             //swap arr[i] and arr[j]
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //              arr[j] = temp;
    //         }
    //     }while(i<=j);
    //     if(low<j){
    //         //swap arr[low] with arr[j]
    //         int temp = arr[low];
    //         arr[low] = arr[j];
    //         arr[j] = temp;
    //     } 
    //     quicksort(low, j-1, arr);
    //     quicksort(j+1, high, arr);   
    // }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 1};
        quickSort(arr, 0, arr.length-1);
        for(int num : arr){
            System.out.print("\t"+num);
        }
        System.out.println();
        //my sample
        int[] arr2 = {22, 76, 43, 50, 1};
        quickSort(arr, 0, arr2.length-1);
        for(int num : arr2){
            System.out.print("\t"+num);
        }
    }
}
