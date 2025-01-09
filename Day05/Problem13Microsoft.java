// problem:- Find the City With the Smallest Number of Neighbors at a Threshold Distance

class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = i == j ? 0 : 10001;     }
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], weight = edge[2];
            dist[u][v] = weight;
            dist[v][u] = weight; 
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        // Step 3: Count reachable cities for each city
        int minReachable = n; // Minimum reachable neighbors
        int resultCity = -1; // City with the desired properties
        for (int i = 0; i < n; i++) {
            int reachable = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && dist[i][j] <= distanceThreshold) {
                    reachable++;
                }
            }

            // Step 4: Update result city
            if (reachable < minReachable || (reachable == minReachable && i > resultCity)) {
                minReachable = reachable;
                resultCity = i;
            }
        }

        return resultCity;
    }
}
