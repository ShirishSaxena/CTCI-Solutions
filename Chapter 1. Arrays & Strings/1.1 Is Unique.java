public class Main {
    // Q 1.1 -> Implement an algorithm to determine if a string has all unique characters.
    // What if you cannot use additional data structures?

    public static void main(String[] args) {
	    String s = "AmIUnique?";
	    System.out.println(s + " : " + isUnique(s));
    }

    static public boolean isUnique(String s){
        // we can't use additional DS that is hashmap/set, but what we can use is int array of size 128
        // from what I know is ASCII is of 128 character set, so we can simply convert each char to their decimal value, increment that
        // and in the same loop check if that value is over 1, if yes ~ return false otherwise true;
        int[] map = new int[128];

        for(char c : s.toCharArray()){
            map[c]++;
            if(map[c] > 1) return false;
        }

        return true;
    }
}
