public class stringEx {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "pooja";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        str1 = "welcome";
        String str3 = "pooja";
        System.out.println(str1.hashCode());
        System.out.println(str3.hashCode());
    }
}
