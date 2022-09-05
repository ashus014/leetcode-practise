package src.dataStructures.javaBasics;
import java.util.HashSet;
import java.util.Set;
public class CommonCharacters {
    
    public static void main(String[] args) {
        
        System.out.println(CommonChars("abcd", "zbce"));
    }

    static String CommonChars(String s1, String s2) {

        String result = "";
        Set<Character> hashSetOfS1 = new HashSet<>();
        for(int i=0; i<s1.length(); i++) {
            hashSetOfS1.add(s1.charAt(i));
        }

        for(int i=0;i <s2.length(); i++) {
            if(hashSetOfS1.contains(s2.charAt(i))) {
                result+=s2.charAt(i);
            }
        }
        return result;
    }
}
