package src.leetCodeProblems;


import java.util.ArrayList;

public class Day004 {

    public boolean canConstruct(String ransomNote, String magazine) {

        ArrayList<Character> subSet = new ArrayList();
        for (int i=0 ; i<ransomNote.length(); i++) {
            subSet.add(ransomNote.charAt(i));
        }

        ArrayList<Character> set = new ArrayList();
        for (int i=0 ; i<magazine.length(); i++) {
            set.add(magazine.charAt(i));
        }

//        int length = (ransomNote.length() > magazine.length()? ransomNote.length() : magazine.length());

        for(int i =0 ;i<magazine.length(); i++){
            subSet.remove(set.get(i));

        }

        if (subSet.size() != 0)
            return false;
        return true;



    }

    public static void main(String[] args) {
        Day004 day004 = new Day004();
        System.out.println(day004.canConstruct("aa","aabaabb"));
    }
}
