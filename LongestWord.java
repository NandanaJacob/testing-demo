public class LongestWord {
    public static String findLongest(String info)
    {
        if(info==null || info.isEmpty()) return "";
        String[] words = info.split("\\s+");
        String longestWord = "";
        for(String word : words)
        {
            if(word.length() > longestWord.length())
            {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        String data = "this session is about string class";
        String longest = findLongest(data);
        System.out.println(longest);
    }
}
