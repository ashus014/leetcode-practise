package src.fanng.google.l3_2025_04.round2;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
*
* Let's say you have a list of words of all dictionary and we need to find out the 5 words which
* have length of five and all have unique characters to them. Basically combined 25 unique chars.
*
*
* */

public class UniqueFiveLetterWordsBacktracking {

    public static void main(String[] args) {
        String dictionaryFile = "dictionary.txt"; // Replace with the actual path
        List<String> fiveLetterUniqueWords = loadFiveLetterUniqueWords(dictionaryFile);

        List<String> currentCombination = new ArrayList<>();
        Set<Character> usedCharacters = new HashSet<>();
        List<List<String>> solutions = new ArrayList<>();

        findSolutions(fiveLetterUniqueWords, 0, currentCombination, usedCharacters, solutions);

        if (solutions.isEmpty()) {
            System.out.println("No set of 5 five-letter words found with 25 unique characters.");
        } else {
            System.out.println("Found the following set(s) of 5 five-letter words with 25 unique characters:");
            for (List<String> solution : solutions) {
                System.out.println(solution);
            }
        }
    }

    public static List<String> loadFiveLetterUniqueWords(String filePath) {
        List<String> fiveLetterUniqueWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim().toLowerCase();
                if (line.length() == 5 && hasUniqueCharacters(line)) {
                    fiveLetterUniqueWords.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading dictionary file: " + e.getMessage());
        }
        return fiveLetterUniqueWords;
    }

    public static boolean hasUniqueCharacters(String word) {
        Set<Character> charSet = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }

    public static void findSolutions(List<String> words, int startIndex, List<String> currentCombination, Set<Character> usedCharacters, List<List<String>> solutions) {
        if (currentCombination.size() == 5) {
            if (usedCharacters.size() == 25) {
                solutions.add(new ArrayList<>(currentCombination));
            }
            return;
        }

        if (usedCharacters.size() > 25) { // Optimization: Prune if we've already exceeded 25 unique chars
            return;
        }

        for (int i = startIndex; i < words.size(); i++) {
            String currentWord = words.get(i);
            boolean canAdd = true;
            Set<Character> currentWordChars = new HashSet<>();

            // Check if the current word has any characters already used
            for (char c : currentWord.toCharArray()) {
                if (usedCharacters.contains(c)) {
                    canAdd = false;
                    break;
                }
                currentWordChars.add(c);
            }

            if (canAdd) {
                currentCombination.add(currentWord);
                usedCharacters.addAll(currentWordChars);
                findSolutions(words, i + 1, currentCombination, usedCharacters, solutions); // Explore further, starting from the next word to avoid duplicates in the combination
                usedCharacters.removeAll(currentWordChars); // Backtrack: remove the characters
                currentCombination.remove(currentCombination.size() - 1); // Backtrack: remove the word
            }
        }
    }
}