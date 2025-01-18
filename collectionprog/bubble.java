package collectionprog;

public class bubble {

    public static int[] bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 1};
        arr = bubbleSort(arr);
        for(int num : arr){
            System.out.print("\t"+num);
        }
    }
}
