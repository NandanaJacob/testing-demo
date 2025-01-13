package collectionprog;

import java.util.*;
public class VectorDemo
{
    @SuppressWarnings({ "deprecation", "unchecked" })
    public static void main(String[] args)
    {
    @SuppressWarnings("rawtypes")
    Vector v=new Vector(3,2);
    System.out.println("Initial Capacity ="+v.capacity());
    System.out.println("Initial Size ="+v.size());
    for(int i=0;i<3;i++)
    v.addElement(new Integer(i));
    System.out.println("Capacity after additions="+v.capacity());
    v.addElement(new Double(23.45));
    v.addElement(new Double(45.75));
    //v.addElement(new Double(67.45));
   
    System.out.println("Initial Size ="+v.size());
    System.out.println("Size after additions="+v.capacity());
    System.out.println("First Element="+(Integer)v.firstElement());
    System.out.println("Last Element="+(Double)v.lastElement());    
    if(v.contains(new Integer(3)))
    System.out.println("Vecor has 3rdlement");
 
    /*Enumeration e =v.elements();
    System.out.println("\nElements in vector:");
    while(e.hasMoreElements())
        {
        System.out.println(e.nextElement()+" ");
        System.out.println();
        }*/
    System.out.println("\nElements in vector:");
   
    @SuppressWarnings("rawtypes")
    Iterator i=v.iterator();
    while(i.hasNext())
        {
        System.out.println(i.next()+" ");
        //System.out.println();
        }
            v.removeElementAt(2);
System.out.println("removed");
    int j=v.lastIndexOf(new Integer(2));
    System.out.println(j);
    int k=v.lastIndexOf(new Integer(0),2);
 
    System.out.println(k);
 
    //  System.out.println("removed");
    i=v.iterator();
    while(i.hasNext())
    {
    System.out.println(i.next()+" ");
    }
    }
}
 