// Problem :- Count Number of Nice Subarray

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countAtMost(nums, k) - countAtMost(nums, k - 1);
    }

    private int countAtMost(int[] nums, int k) {
        int left = 0, right = 0, oddCount = 0, result = 0;

        while (right < nums.length) {
            if (nums[right] % 2 != 0) {
                oddCount++;
            }

            while (oddCount > k) {
                if (nums[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }

            result += (right - left + 1);
            right++;
        }

        return result;
    }
}

