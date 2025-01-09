// problem:- Minimum Cost to Convert String I

import java.util.*;

class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int INF = (int) 1e9;
        int n = original.length;

        int[][] minCost = new int[26][26];
        for (int i = 0; i < 26; i++) {
            Arrays.fill(minCost[i], INF);
            minCost[i][i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int from = original[i] - 'a';
            int to = changed[i] - 'a';
            minCost[from][to] = Math.min(minCost[from][to], cost[i]);
        }

        // Apply Floyd-Warshall to find shortest paths
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    minCost[i][j] = Math.min(minCost[i][j], minCost[i][k] + minCost[k][j]);
                }
            }
        }

        // Calculate the minimum cost to transform source to target
        long totalCost = 0;
        for (int i = 0; i < source.length(); i++) {
            int sChar = source.charAt(i) - 'a';
            int tChar = target.charAt(i) - 'a';

            if (minCost[sChar][tChar] == INF) {
                return -1; // Transformation not possible
            }

            totalCost += minCost[sChar][tChar];
        }

        return totalCost;
    }
}
