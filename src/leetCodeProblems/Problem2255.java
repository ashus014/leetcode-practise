package src.leetCodeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem2255 {

    public static void main(String[] args) {

        int[][] matches = { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 },
                { 10, 9 } };

        System.out.println(findWinners(matches));

    }

    // public static List<List<Integer>> findWinners(int[][] matches) {

    // List<List<Integer>> result = new ArrayList<>();

    // Map<Integer, Integer> winners = new HashMap<>();
    // Map<Integer, Integer> looser = new HashMap<>();

    // Set<Integer> allCandidates = new HashSet<>();
    // for (int i = 0; i < matches.length; i++) {
    // for (int j = 0; j < matches[i].length; j++) {
    // allCandidates.add(matches[i][j]);
    // }
    // }

    // // System.out.println(allCandidates);

    // // for (int i = 0; i < matches.length; i++) {
    // // looser.put(matches[i][0], looser.getOrDefault(matches[i][0], 0));
    // // }
    // for (int i = 0; i < matches.length; i++) {
    // looser.put(matches[i][1], looser.getOrDefault(matches[i][1], 0) + 1);
    // }

    // // winners.forEach((k, v) -> System.out.println(k + " -> " + v));
    // // looser.forEach((k, v) -> System.out.println(k + " -> " + v));

    // List<Integer> oneTimeLooser = new ArrayList<>();

    // // let's find winners
    // looser.forEach((k, v) -> {
    // allCandidates.remove(k);

    // if (v == 1) {
    // oneTimeLooser.add(k);
    // }
    // });

    // List<Integer> allWinners = new ArrayList<>(allCandidates);
    // Collections.sort(allWinners);
    // Collections.sort(oneTimeLooser);
    // result.add(allWinners);
    // result.add(oneTimeLooser);
    // return result;
    // }

    public static List<List<Integer>> findWinners(int[][] matches) {

        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, Integer> looser = new HashMap<>();

        for (int i = 0; i < matches.length; i++) {
            looser.put(matches[i][0], looser.getOrDefault(matches[i][0], 0));
        }
        for (int i = 0; i < matches.length; i++) {
            looser.put(matches[i][1], looser.getOrDefault(matches[i][1], 0) + 1);
        }

        // looser.forEach((k, v) -> System.out.println(k + " -> " + v));

        List<Integer> oneTimeLooser = new ArrayList<>();
        List<Integer> winners = new ArrayList<>();

        // let's find winners
        looser.forEach((k, v) -> {
            if (v == 1) {
                oneTimeLooser.add(k);
            }
            if (v == 0) {
                winners.add(k);
            }
        });

        Collections.sort(oneTimeLooser);
        Collections.sort(winners);
        result.add(winners);
        result.add(oneTimeLooser);

        return result;
    }
}
