package src.Java8Practise.randomCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Code12 {

    public static void main(String[] args) {
        int[][] edges = { { 0, 1 },
                { 0, 2 },
                { 1, 4 },
                { 1, 5 },
                { 2, 3 },
                { 2, 6 } };
        int n = 7;
        String labels = "abaedcd";
        System.out.println(Arrays.toString(countSubTrees(n, edges, labels)));
    }

    public static int[] countSubTrees(int n, int[][] edges, String labels) {

        int[] ans = new int[n];

        Map<Integer, ArrayList<Integer>> adj = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adj.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
            adj.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
        }
        char[] label = labels.toCharArray();
        dfs(0, -1, adj, label, ans);
        return ans;
    }

    public static int[] dfs(int node, int parent, Map<Integer, ArrayList<Integer>> adj, char[] label, int[] ans) {

        int[] nodeCount = new int[26];
        nodeCount[label[node] - 'a'] = 1;

        if (!adj.containsKey(node))
            return nodeCount;

        for (int child : adj.get(node)) {
            if (child == parent)
                continue;

            int[] childCounts = dfs(child, node, adj, label, ans);

            for (int i = 0; i < 26; i++)
                nodeCount[i] += childCounts[i];
        }
        ans[node] = nodeCount[label[node] - 'a'];
        return nodeCount;
    }
}
