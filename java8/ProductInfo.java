package java8;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Stream.*;
public class ProductInfo {
    public static void main(String[] args) {
        // ArrayList<Product> ls = new ArrayList<Product>();
        // ls.add(new Product(1, "pencil",10));
        // ls.add(new Product(2, "pen", 20));
        // ls.add(new Product(3, "eraser", 30));

        //List<Product> l2 = new ArrayList<Product>();
        Product p1 = new Product(4, "scale", 40);
        Product p2 = new Product(5, "Ruler", 50);
        List<Product> l2 = Arrays.asList(p1, p2);
        //u wanna extract value frm list => use stream
        int sum = l2.stream().mapToInt(x -> x.getPrice()).sum();
        System.out.println(sum);

        List price = l2.stream().map(x -> x.getPrice()).collect(Collectors.toList());
        price.forEach(System.out::println); //method reference

        System.out.println(l2.stream().filter(x -> x.getPrice() > 10).count());
        //DO TASK = make this not case sensitive
        String s = l2.stream()
        .map(Product::getName)
        .filter(x -> x.startsWith("r"))
        .sorted()
        .collect(Collectors.joining(" "));
        System.out.println(s);

        String s1 = l2.stream()
        .map(Product::getName)
        .filter(x -> x.startsWith("R"))
        .sorted()
        .collect(Collectors.joining(" "));
        System.out.println(s1);
    }
}

//--------------------------------------------------------------------------------
// Stream API
 
// import java.util.*;
// import java.util.stream.*;
// public class ProductInfo {
 
// 	public static void main(String[] args) {
		
// 		Product p1 = new Product(10,"pencil",5);
// 		Product p2 = new Product(20,"pen",20);
// 		Product p3 = new Product(30,"Eraser",8);
		
// 		List<Product> ls = Arrays.asList(p1,p2,p3);
		
// 		int sum = ls.stream().mapToInt(x->x.getPrice()).sum();
// 		System.out.println(sum);
		
// 		List price = ls.stream().map(x->x.getPrice()).collect(Collectors.toList());
// 		price.forEach(System.out::println); // :: method reference
		
// 		System.out.println(ls.stream().filter(x->x.getPrice()>10).count());
		
// 		List<String> ls1 = Arrays.asList("Pencil","Pen","Eraser");
// 		String s=ls1.stream().filter(x->x.startsWith("P")).sorted().collect(Collectors.joining(" "));
// 		System.out.println(s); // print the data by ignoring the case
		
		
// 		String s1=ls.stream().map(x->x.getName()).filter(x->x.startsWith("E")).collect(Collectors.joining(" "));
// 		System.out.println(s1);
		
// 	}
// }
 
// has context menu
// Compose