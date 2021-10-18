// TO DO : InPlace CHAR 

public class Main {
/*   Q 1.3 -> URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
                has sufficient space at the end to hold the additional characters, and that you are given the "true"
                length of the string. (Note: If implementing in Java, please use a character array so that you can
                perform this operation in place.)
        EXAMPLE
            Input: "Mr John Smith    ", 13
            Output: "Mr%20John%20Smith" */



    public static void main(String[] args) {
	    String s = "Mr John Smith    ";
	    System.out.println(URLify(s));
    }
  
 

    static private String URLify(String s){
        // using stringBuilder
        StringBuilder sb = new StringBuilder();

        s = s.trim();
        for(char c : s.toCharArray()){
            if(c == ' ')
                sb.append("%20");
            else
                sb.append(c);
        }

        return sb.toString();
        
        // even this ain't any better...
        // just looking for ways I can solve this.
    }

    static private String URLify_Naive(String s) {
        // shouldn't use in interview...
        // simply string.replace with regex;
        // trim to remove starting and ending space the replaceAll to replace with %20;
        return s.trim().replaceAll(" +", "%20");
    }
}
