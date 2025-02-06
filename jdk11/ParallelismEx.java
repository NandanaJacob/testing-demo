package jdk11;

import java.util.List;
 
public class ParallelismEx {
 
	public static void main(String[] args) {
		List<String> names = List.of("Sandy","Akash","Shiva","Pranav");
		names.parallelStream().forEach(name->
		System.out.println(Thread.currentThread().getName()+ "  --- "+ name));
	}
}