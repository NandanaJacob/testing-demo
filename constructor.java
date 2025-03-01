//import org.w3c.dom.css.Rect;

class Rectangle{
    int l, b;
    //starting default constructer to simply final
    Rectangle(){
        System.out.println("default constructor");
    }

    //starting parameterized constructor to assign values to l and b of class
    Rectangle(int len, int br){
        l=len;
        b=br;
    }
    /*  NAME OF PARAMETER AND CLASS MEMBERS ARE SAME
    ______________________________________________
     * if it was Rectangle(int l, int b)
     * {
     *  this.l = l;
     *  this.b = b;
     * }
     * 
     * NOTE: overloading has happened with Rectangle constructor.
     * 
     * NOTE: even if Rectangle() constructor is not created in rectangle class and we write 
     * Rectangle r1 = new Rectangle() in main function
     * then an implicit code is created like
     * Rectangle() { super() or smthign}
     * this will allow u to work with that r1
     */


    //a method:
    void disp(){
        System.out.println("l=" + l + " b=" + b);
    }
}
public class constructor {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.disp();
        Rectangle r2 = new Rectangle(100, 200);
        r2.disp();
        
    }
}
