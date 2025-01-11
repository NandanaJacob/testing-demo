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
    public int calculate() {
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        } finally {
            return 30; // Overrides all previous returns
        }
    }
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
        FinallyExample obj = new FinallyExample();
        int k = obj.calculate();
        System.out.println(k);
    }
}


// u use return to finish methods ryt
// so use same concept in finally
// the finally block is necessary because it ensures critical cleanup code always runs even if:

// An exception is thrown.
// The method exits early (e.g., return).
// The program flow is interrupted (e.g., break or continue).

// public int calculate() {
//     try {
//         return 10;
//     } catch (Exception e) {
//         return 20;
//     } finally {
//         return 30; // Overrides all previous returns
//     }
// }
//output= 30
