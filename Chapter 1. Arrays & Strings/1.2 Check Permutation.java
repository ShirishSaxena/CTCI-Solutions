public class Main {
    // Q 1.2 -> Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.


    public static void main(String[] args) {
	    String s1 = "abdsd", s2 = "dsdat";
	    System.out.println(checkPermutation(s1, s2));
    }

    static public boolean checkPermutation(String s1, String s2) {
        // going to assume that string are ASCII lowercase Alphabet letters
        // for string to be permutation, both string should be of equal size otherwise we can use sliding window technique to do the same

        if(s1.length() != s2.length()) return false;

        int[] map = new int[26];

        // store occurance of each character in s1 to map array
        for(char c : s1.toCharArray())
            map[c - 'a']++;

        // simply iterate over s2 and check if map[c] is less than zero, if so return false;

        for(char c : s2.toCharArray()){
            if(--map[c - 'a'] < 0) return false;
        }

        return true;
    }
}
