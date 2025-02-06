package jdk11;

public class SwitchEx {
 
	public static void main(String[] args) {
		Object obj = "hello";
		switch(obj)
		{
			case String s -> System.out.println("String :" +s.toUpperCase());
			case Integer i ->System.out.println("Integer : "+(i*2));
			case null ->System.out.println("null");
			default ->System.out.println("Uknown input type");
		}
	}
}
