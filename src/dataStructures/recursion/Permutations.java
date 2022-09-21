package src.dataStructures.recursion;

import java.util.ArrayList;

public class Permutations {
    
    public static void main(String[] args) {
        
        // permutations("", "abc");
        System.out.println(permutations2("", "abc"));
    }

    // Printing all the possible permutations
    static void permutations(String p, String up) {

        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0; i<= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    // Adding all possible permutations in ArrayList
    static ArrayList<String> permutations2(String p, String up) {

        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // ArrayList local to this call
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutations2(f + ch + s, up.substring(1)));
        }

        return ans;
    }
}
