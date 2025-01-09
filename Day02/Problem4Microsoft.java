// problem:- Russian Doll Envelopes

import java.util.Arrays;

class Solution {
    public int maxEnvelopes(int[][] envelopes) {
  
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1]; 
            }
            return a[0] - b[0];
        });

        int[] heights = new int[envelopes.length];
        for (int i = 0; i < envelopes.length; i++) {
            heights[i] = envelopes[i][1];
        }

        return lengthOfLIS(heights);
    }

    private int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for (int num : nums) {
            int index = Arrays.binarySearch(dp, 0, len, num);
            if (index < 0) {
                index = -(index + 1);
            }
            dp[index] = num;
            if (index == len) {
                len++;
            }
        }

        return len;
    }
}
