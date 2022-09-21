package src.dataStructures.recursion;
import java.util.ArrayList;
import java.util.Arrays;
public class SubsetQuestions {
    
    public static void main(String[] args) {
        // subseq("", "abc");

        System.out.println((subseq2("", "abc")));
    }

    // only prinitng
    static void subseq(String p, String up) {

       if(up.length() == 0) {
        System.out.println(p);
        return;
       }

       char c = up.charAt(0);

       subseq(p+c, up.substring(1));
       subseq(p, up.substring(1));
    }

    // adding it into an ArrayList
    static ArrayList<String> subseq2(String p, String up) {
       
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
    
           char c = up.charAt(0);
    
          ArrayList<String> left = subseq2(p+c, up.substring(1));
          ArrayList<String> right = subseq2(p, up.substring(1));
          left.addAll(right);
          return left;
    }
}
