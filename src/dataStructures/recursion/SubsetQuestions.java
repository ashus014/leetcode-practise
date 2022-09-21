package src.dataStructures.recursion;

public class SubsetQuestions {
    
    public static void main(String[] args) {
        subseq("", "abc");
    }

    static void subseq(String p, String up) {

       if(up.length() == 0) {
        System.out.println(p);
        return;
       }

       char c = up.charAt(0);

       subseq(p+c, up.substring(1));
       subseq(p, up.substring(1));
    }
}
