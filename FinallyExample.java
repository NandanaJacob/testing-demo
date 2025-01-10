import java.util.Scanner;
/* 
public class FinallyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {12, 3, 4, 5};
        int number = numbers[5];
        System.out.println("Before scanner closes");
        sc.close();
    }
}
 */
public class FinallyExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int[] numbers = {1,2,3,4};
            int number = numbers[5];
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Before scanner closes");
            sc.close();
        }
    }
}


// u use return to finish methods ryt
// so use same concept in finally