public class testing {
    public static void main(String[] args) {
        // Print Hello, World! to the console
        System.out.println("Hello, World!");

        int[] arr = {10, 45,23,67,11};
        int gr = arr[0];
        //for(int i=0; i<arr.length; i++)
        for(int num:arr)
        {
            if(gr<arr[num])
            {
                gr = arr[num];
            }
        }
        System.out.println(gr);
    }
}
