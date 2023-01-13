package src.leetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1519 {

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
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            adj.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
            adj.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
        }

        System.out.println(adj);
        int[] ans = new int[n];
        char[] label = labels.toCharArray();
        dfs(0, -1, adj, label, ans);
        return ans;
    }

    public static int[] dfs(int node, int parent, Map<Integer, List<Integer>> adj,
            char[] labels, int[] ans) {
        // Store count of all alphabets in the subtree of the node.
        int[] nodeCounts = new int[26];
        nodeCounts[labels[node] - 'a'] = 1;

        if (!adj.containsKey(node))
            return nodeCounts;
        for (int child : adj.get(node)) {
            if (child == parent) {
                continue;
            }
            int[] childCounts = dfs(child, node, adj, labels, ans);
            // Add frequencies of the child node in the parent node's frequency array.
            for (int i = 0; i < 26; i++) {
                nodeCounts[i] += childCounts[i];
            }
        }

        ans[node] = nodeCounts[labels[node] - 'a'];
        return nodeCounts;
    }

}
