public class stringEx {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = "pooja";

        //System.out.println(str1.hashCode());
        //System.out.println(str2.hashCode());

        str1 = "welcome";
        //String str3 = "pooja";
        //System.out.println(str1.hashCode());
        //System.out.println(str3.hashCode());

        //System.out.println(str1==str2);
        //System.out.println(str3==str2);

        //check concat
        //System.out.println(str1.concat(str2));

        //__________________________________________
        //STRING BUFFER
        StringBuffer sb = new StringBuffer("welcome "); //2 bytes = 16 bites
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.append("to my session"));
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.reverse());

        //____________________________________________
        //STRING BUILDER
    }
}
//str1 -> (hello,welcome)
//str2, atr3 -> pooja