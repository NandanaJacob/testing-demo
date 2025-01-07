// StringComparisonDemo.java
public class StringComparisonDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Hi";

        System.out.println("String 1: \"" + str1 + "\"");
        System.out.println("String 2: \"" + str2 + "\"");

        // for str1 and str2
        System.out.println("\n1. Using == operator: " + (str1 == str2));
        System.out.println("2. Using equals(): " + str1.equals(str2));
        System.out.println("3. Using compareTo(): " + str1.compareTo(str2));

        //fir str2 and str3
        System.out.println("\n1. Using == operator: " + (str3 == str2));
        System.out.println("2. Using equals(): " + str3.equals(str2));
        System.out.println("3. Using compareTo(): " + str3.compareTo(str2));
    }
}
