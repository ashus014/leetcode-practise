package src.fanng.google.l3_2025_04.round1;

import java.util.*;


/*
https://leetcode.com/discuss/post/6617221/google-l3-interview-experience-by-anonym-nt48/
* Let's say you have given a list of neighborhood, each neighborhood has different houses in it,
* e.g {{8,2,9}, {4,6,4}, {4,5,1}}. Respective house color is also given {{'x','r','b'}, {'z', 'r', 'q'}, {'c', 'x', 'a'}}.
*
*We need to return the sorted house order with color attached to it but one condition is
* that one neighborhood can't have same house number twice in it. Result of above example is:
{{'1a','2r','4z'}, {'4q','5x','6r'}, {'4c','8x','9b'}}.
* */
public class HouseColor {

    public static List<List<String>> sortHousesWithColors(List<List<Integer>> neighborhoods,
                                                          List<List<Character>> colors) {

        // Flatten all houses with their colors
        List<HouseWithColor> allHouses = new ArrayList<>();
        for (int i = 0; i < neighborhoods.size(); i++) {
            for (int j = 0; j < neighborhoods.get(i).size(); j++) {
                int houseNum = neighborhoods.get(i).get(j);
                char color = colors.get(i).get(j);
                allHouses.add(new HouseWithColor(houseNum, color));
            }
        }

        // Sort all houses by number
        Collections.sort(allHouses);

        int n = neighborhoods.size();
        int housesPerNeighborhood = allHouses.size() / n;

        // Initialize result
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(new ArrayList<>());
        }

        // Keep track of house numbers per neighborhood
        Set<Integer>[] usedNumbers = new HashSet[n];
        for (int i = 0; i < n; i++) {
            usedNumbers[i] = new HashSet<>();
        }

        // Assign houses to neighborhoods
        for (HouseWithColor house : allHouses) {
            // Find the first neighborhood that doesn't have this house number
            for (int i = 0; i < n; i++) {
                if (!usedNumbers[i].contains(house.houseNum) && result.get(i).size() < housesPerNeighborhood) {
                    result.get(i).add(house.houseNum + "" + house.color);
                    usedNumbers[i].add(house.houseNum);
                    break;
                }
            }
        }

        return result;
    }

    // Helper class to represent a house with its color
    private static class HouseWithColor implements Comparable<HouseWithColor> {
        int houseNum;
        char color;

        public HouseWithColor(int houseNum, char color) {
            this.houseNum = houseNum;
            this.color = color;
        }

        @Override
        public int compareTo(HouseWithColor other) {
            return Integer.compare(this.houseNum, other.houseNum);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example from the problem statement
        List<List<Integer>> neighborhoods = Arrays.asList(
                Arrays.asList(8, 2, 9),
                Arrays.asList(4, 6, 4),
                Arrays.asList(4, 5, 1)
        );

        List<List<Character>> colors = Arrays.asList(
                Arrays.asList('x', 'r', 'b'),
                Arrays.asList('z', 'r', 'q'),
                Arrays.asList('c', 'x', 'a')
        );

        List<List<String>> result = sortHousesWithColors(neighborhoods, colors);

        // Print the result
        System.out.println(result);
    }
}