public class movezero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        //move zeroes to right side
        int n = arr.length;
        int index = 0;
        for(int num:arr)
        {
            //if num is not 0, place it on lhs
            if(num!=0)
            {
                arr[index++] = num;
                //same as arr[index]=num then index++
            }
        }
        while(index<n)
        {
            arr[index++]=0;
        }
        for(int res:arr)
        {
            System.out.println(res);
        }
    }
}
