package src.dataStructures.recursion;

public class WorkingWithStrings {

    public static void main(String[] args) {
        
        //approach 1
        //System.out.println(removeCharacter("baccab", 'b'));

        //approach 2
        // System.out.println(skipApple("applestrapplestrapple"));

        System.out.println(skipAppNotApple("appleashu"));

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

    //skip "apple"
    public static String skipApple(String str) {

        if(str.isEmpty()) {
            return "";
        }

        if(str.startsWith("apple")) {
            return skipApple(str.substring(5));
        }
        else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    //skip "app" not "apple"
    public static String skipAppNotApple(String str) {

        if(str.isEmpty()) {
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        }
        else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
      
}
