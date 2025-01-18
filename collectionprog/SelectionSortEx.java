package collectionprog;

public class SelectionSortEx{
    public static int[] selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min_index =  i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            //found smallest value index. swap it with i
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 1};
        arr = selection(arr);
        for(int num : arr){
            System.out.print("\t"+num);
        }
    }
    
}
