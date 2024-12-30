import java.util.Arrays;

public class anagram {
    public static boolean isAnagram(String s1, String s2)
        {
            if(s1.length()!=s2.length())
            {
                return false;
            }
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            return Arrays.equals(s1Array, s2Array);
        }
    public static void main(String[] args) {
        String str1 = "listen";
		String str2 = "silence";
		System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram("abc", "cba"));
    }
}
