package src.dataStructures.recursion;

public class WorkingWithStrings {

    public static void main(String[] args) {
        
        //approach 1
        //System.out.println(removeCharacter("baccab", 'b'));

        //approach 2

    }

    //approach 1
    public static String removeCharacter(String str, Character c) {

        return removeCharacterHelper(str, c, "", 0);
    }

    public static String removeCharacterHelper(String str, Character c, String answer, int index) {

        if(index == str.length()) {
            return answer;
        }

        if(str.charAt(index) != c) {
            answer += str.charAt(index);
        }

        return removeCharacterHelper(str, c, answer, index+1);
    }

    //approach 2
    public static String skip(String str) {

        if(str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'b') {
            return skip(str.substring(1));
        }
        else {
            return ch + skip(str.substring(1));
        }
    }
}
