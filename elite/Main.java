package elite;
import pack1.SumNumber;
public class Main extends SumNumber{
    public static void main(String[] args) {
        Hello h1 = new Hello();
        h1.disp();

        SumNumber.sum(2,7); //shows error cus visibility is less cus static
        //if sum was public in SumNumber, there would be no issue
    }
}
