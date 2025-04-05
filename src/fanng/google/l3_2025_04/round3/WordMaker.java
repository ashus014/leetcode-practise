package src.fanng.google.l3_2025_04.round3;

import java.util.ArrayList;
import java.util.List;

public class WordMaker {

    public static boolean canMakeWord(String mainString, String word) {
        int mainPtr = 0;
        int wordPtr = 0;

        while (mainPtr < mainString.length() && wordPtr < word.length()) {
            if (mainString.charAt(mainPtr) == word.charAt(wordPtr)) {
                wordPtr++;
            }
            mainPtr++;
        }

        return wordPtr == word.length();
    }

    public static List<String> findMakeableWords(String mainString, List<String> wordList) {
        List<String> makeableWords = new ArrayList<>();
        for (String word : wordList) {
            if (canMakeWord(mainString, word)) {
                makeableWords.add(word);
            }
        }
        return makeableWords;
    }

    public static void main(String[] args) {
        String mainStr = "abracadabra";
        List<String> words = List.of("car", "cad", "bra", "zebra", "ace", "bad");

        List<String> result = findMakeableWords(mainStr, words);
        System.out.println("Given string: " + mainStr);
        System.out.println("List of words: " + words);
        System.out.println("Words that can be made: " + result);

        String mainStr2 = "programming";
        List<String> words2 = List.of("program", "gram", "rope", "ring", "main");
        List<String> result2 = findMakeableWords(mainStr2, words2);
        System.out.println("\nGiven string: " + mainStr2);
        System.out.println("List of words: " + words2);
        System.out.println("Words that can be made: " + result2);


        System.out.println("************************************");
        System.out.println("************************************");
        System.out.println("************************************");

        String mainStr3 = "ozweitosgshg";
        List<String> words3 = List.of("egg", "zoo");
        List<String> result3 = findMakeableWords(mainStr3, words3);
        System.out.println("\nGiven string: " + mainStr3);
        System.out.println("List of words: " + words3);
        System.out.println("Words that can be made: " + result3);
    }
}