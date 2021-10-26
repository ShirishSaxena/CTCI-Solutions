public class Main {
/*   Q 1.5 -> One Away: There are three types of edits that can be performed on strings: insert a character,
              remove a character, or replace a character. Given two strings, write a function to check if they are
              one edit (or zero edits) away.
              EXAMPLE
                    pale, ple -> true
                    pales, pale -> true
                    pale, bale -> true
                    pale, bake -> false
              */

    public static void main(String[] args) {
        String[][] tests = {{"a", "b", "true"},
                {"", "d", "true"},
                {"d", "de", "true"},
                {"pale", "pse", "false"},
                {"acdsfdsfadsf", "acdsgdsfadsf", "true"},
                {"acdsfdsfadsf", "acdsfdfadsf", "true"},
                {"acdsfdsfadsf", "acdsfdsfads", "true"},
                {"acdsfdsfadsf", "cdsfdsfadsf", "true"},
                {"adfdsfadsf", "acdfdsfdsf", "false"},
                {"adfdsfadsf", "bdfdsfadsg", "false"},
                {"adfdsfadsf", "affdsfads", "false"},
                {"pale", "pkle", "true"},
                {"pkle", "pable", "false"}};

        for(String[] test : tests){
            System.out.println(test[0] + "\t" + test[1] + "\t: " + OneAway(test[0], test[1]));
        }
    }

    static private boolean OneAway(String first, String second){
        if(first.length() == second.length()) // replace away
            return OneReplaceAway(first, second);
        else if(first.length() + 1 == second.length())
            return OneInsertAway(first, second);
        else if(first.length() == second.length()+1)
            return OneInsertAway(second, first);
        return false;
    }
    static private boolean OneInsertAway(String first, String second){
        // first is always smaller here
        int index1, index2;
        index1 = index2 = 0;

        while(index2 < second.length() && index1 < first.length()){
            if(second.charAt(index2) != first.charAt(index1)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }
            else{
                index1++; index2++;
            }
        }

        return true;
    }

    static private boolean OneReplaceAway(String first, String second){
        boolean isReplaced = false;
        for(int i=0; i < first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                if(isReplaced) return false;
                isReplaced = true;
            }
        }
        return true;
    }
}
