/*
Optimization can be done but it's a easy question so just gonna move to another one.
*/

public class Main {
/*   Q 1.6 ->   String Compression: Implement a method to perform basic string compression using the counts
                of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
                "compressed" string would not become smaller than the original string, your method should return
                the original string. You can assume the string has only uppercase and lowercase letters (a - z).

              */

    public static void main(String[] args) {
        String[] tests = {"aabcccccaaa", "ffgggfdd", "aa", "a", "", "aaaaabbbbaaaabbddc"};
        for(String test : tests)
            System.out.println(test + "\t: " + Str_Compress(test));
    }

    private static String Str_Compress(String s){
        if(s.length() == 0) return s;
        StringBuilder sb = new StringBuilder();

        int count = 1;
        char curr = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == curr)
                count++;
            else{
                sb.append(curr);
                sb.append(count);
                curr = s.charAt(i);
                count = 1;
            }
        }
        sb.append(curr);
        sb.append(count);

        if(sb.length() >= s.length()) return s;
        return sb.toString();
    }
}
