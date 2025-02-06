package jdk11;

import java.util.stream.Collectors;
import java.util.*;
 
public class StringEx {
 
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(s.isBlank());
 
		
		 s = ""; System.out.println(s.isBlank());
		  String s1 = "Hi \nwhere\t are you"; System.out.println(s1);
		  List ls = s1.lines().collect(Collectors.toList()); System.out.println(ls);
		  String s2 = "    Hi where are you    "; System.out.println("["+ s2 +"]");
		  System.out.println("["+s2.strip()+"]");
		  System.out.println("["+s2.stripLeading()+"]"); 
		  System.out.println("["+s2.stripTrailing()+"]");
		System.out.println(s.repeat(3));
	}
 
}


