package src.interviews.lloyds;/*
You are analyzing data for Aquaintly, a hot new social network.

On Aquaintly, connections are always symmetrical. If a user Alice is connected to Bob, then Bob is also connected to Alice.

You are given a sequential log of CONNECT and DISCONNECT events of the following form:
- This event connects users Alice and Bob: ["CONNECT", "Alice", "Bob"]
- This event disconnects the same users: ["DISCONNECT", "Bob", "Alice"] (order of users does not matter)

We want to separate users based on their popularity (number of connections). To do this, write a function that takes in the event log and a number N and returns two collections:
[Users with less than N connections], [Users with N or more connections]

Example:
events = [
    ["CONNECT","Alice","Bob"],
    ["DISCONNECT","Bob","Alice"],
    ["CONNECT","Alice","Charlie"],
    ["CONNECT","Dennis","Bob"],
    ["CONNECT","Pam","Dennis"],
    ["DISCONNECT","Pam","Dennis"],
    ["CONNECT","Pam","Dennis"],
    ["CONNECT","Edward","Bob"],
    ["CONNECT","Dennis","Charlie"],
    ["CONNECT","Alice","Nicole"],
    ["CONNECT","Pam","Edward"],
    ["DISCONNECT","Dennis","Charlie"],
    ["CONNECT","Dennis","Edward"],
    ["CONNECT","Charlie","Bob"]
]

Using a target of 3 connections, the expected results are:
Users with less than 3 connections: ["Alice", "Charlie", "Pam", "Nicole"]
Users with 3 or more connections: ["Dennis", "Bob", "Edward"]

All test cases:
grouping(events, 3) => [["Alice", "Charlie", "Pam", "Nicole"], ["Dennis", "Bob", "Edward"]]
grouping(events, 1) => [[], ["Alice", "Charlie", "Dennis", "Bob", "Pam", "Edward", "Nicole"]]
grouping(events, 10) => [["Alice", "Charlie", "Dennis", "Bob", "Pam", "Edward", "Nicole"], []]
Complexity Variables:
E = number of events
U = number of users


*/
import java.io.*;
import java.util.*;
import javafx.util.Pair;

public class Solution {
    public static void main(String[] argv) {
        String[][] events = {
                {"CONNECT","Alice","Bob"},
                {"DISCONNECT","Bob","Alice"},
                {"CONNECT","Alice","Charlie"},
                {"CONNECT","Dennis","Bob"},
                {"CONNECT","Pam","Dennis"},
                {"DISCONNECT","Pam","Dennis"},
                {"CONNECT","Pam","Dennis"},
                {"CONNECT","Edward","Bob"},
                {"CONNECT","Dennis","Charlie"},
                {"CONNECT","Alice","Nicole"},
                {"CONNECT","Pam","Edward"},
                {"DISCONNECT","Dennis","Charlie"},
                {"CONNECT","Dennis","Edward"},
                {"CONNECT","Charlie","Bob"}
        };

        System.out.println(findMinMaxConnections(events));

    }

    private static List<List<String>> findMinMaxConnections(String[][] events) {

        List<List<String>> result = new ArrayList<>();
        String CONNECT = "CONNECT";
        String DISCONNECT = "DISCONNECT";
        int TYPE_OF_CONNECTION = 0;
        int FIRST_NAME = 1;
        int SECOND_NAME = 2;
        Integer size = 3;

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i< events.length; i++) {

            if(Objects.equals(events[i][TYPE_OF_CONNECTION], CONNECT)) {
                map.put(events[i][FIRST_NAME], map.getOrDefault(events[i][FIRST_NAME],0) + 1);
                map.put(events[i][SECOND_NAME], map.getOrDefault(events[i][SECOND_NAME],0) + 1);

            } else {
                // get the record fop first name & second name and decease one
                map.put(events[i][FIRST_NAME], map.getOrDefault(events[i][FIRST_NAME],0) - 1);
                map.put(events[i][SECOND_NAME], map.getOrDefault(events[i][SECOND_NAME],0) - 1);
            }
        }

        result.add(helper(map, "MIN", size));
        result.add(helper(map, "MAX", size));
        return result;

    }


    private static List<String> helper(Map<String, Integer> map, String MIN_MAX, int SIZE) {
        List<String> result = new ArrayList<>();

        if(Objects.equals(MIN_MAX, "MIN")) {
            for (Map.Entry<String, Integer> temp : map.entrySet()) {
                if(temp.getValue() < SIZE) {
                    result.add(temp.getKey());
                }
            }
            return result;
        }

        for (Map.Entry<String, Integer> temp : map.entrySet()) {
            if(temp.getValue() >= SIZE) {
                result.add(temp.getKey());
            }
        }
        return result;
    }

}
