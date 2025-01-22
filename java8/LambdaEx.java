package java8;

import java.util.Date;
@FunctionalInterface
interface Shape{
    int draw(int a, int b);
    //void draw1(); 
    //cannot be more than one abstract method cus Shape is a functional interface if lambda exp is to be defined for draw()
    //but if u do add more than one abstract method here, no errors will show up
    //=>while declaring the interface make a restriction using annotation @FunctionalInterface
}

public class LambdaEx {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        //_________________________________________________________________
        //showing Date class api:
        Date dt = new Date();
        System.out.println("date= " + dt);
        System.err.println("date only= "+dt.getDate());
        System.err.println("hour= "+dt.getHours());
        System.err.println("day of week = "+dt.getDay());
        System.err.println("month = "+dt.getMonth());
        System.err.println("time = "+dt.getTime()); //calculates time in milliseconds
        //to resolve this, we have date and time api

        //__________________________________________________________________
        //HOW TO DEFINE AND CALL AN ABSTRACT METHOD DIRECTLY WITHOUT IMPLEMENTING THAT CLASS IN ANOTHER CLASS, INHERITING THIS CLASS, THEN EXECUTING IT
        //  *************** ANONYMOUS CLASS ***********************
        //let us make object of shape without implementing the interface
        //object creation for interface is not possible, only reference is possible
        //so we can do like this:-
        Shape s = new Shape() {
            public int draw(int l, int b){
                return l*b;
            }
        }; //this is an anonymous class
        //class is getting DEFINED here, but we dont know which class
        //static modifier is possible only for inner classes- 
        //anonymous class is a topic under inner class

        //now i can call this method
        int area = s.draw(5, 3);
        System.out.println("area = "+area);
        //__________________________________________________________________

        //*****************LAMBDA EXPRESSION***************** */
        Shape s2 = (int l,int b) -> (l*b); //cannot work if theres more than one abstract method in interface
        //Shape s2 = (int l,int b) -> (return l*b); //can also write this way
        System.err.println("lamdba example area = " + s2.draw(6, 4));
        //__________________________________________________________________
    }
    
}
