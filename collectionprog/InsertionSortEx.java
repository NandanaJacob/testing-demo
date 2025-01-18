package collectionprog;

public class InsertionSortEx{
    public static int[] insertion(int[] arr){
        //0th element is fixed
        for(int i=1; i<arr.length; i++){
            //need to insert ith element in its right place
            for(int j = 0; j<i; j++){
            //for(int j = i-1; j>=0; j--){
                if(arr[j] > arr[i]){ //swap arr[j] and arr[i]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    // public static int[] insertion(int[] arr){
    //     //0th element is fixed
    //     for(int i=1; i<arr.length; i++){
    //         //need to insert ith element in its right place
    //         int key = arr[i]; // The element to be inserted
    //         int j = i - 1;
    //         // Shift elements of the sorted portion (arr[0..i-1]) to the right
    //         while (j >= 0 && arr[j] > key) {
    //             arr[j + 1] = arr[j];
    //             j--;
    //         }

    //         // Place the key in its correct position
    //         arr[j + 1] = key;
    //     }
    //     return arr;
    // }
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 1};
        arr = insertion(arr);
        for(int num : arr){
            System.out.print("\t"+num);
        }
        System.out.println();
        //my sample
        int[] arr2 = {22, 76, 43, 50, 1, 23};
        arr2 = insertion(arr2);
        for(int num : arr2){
            System.out.print("\t"+num);
        }
    }
    
}
