// problem: -  Maximum Sum of Distinct Subarrays With Length K

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;

        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> windowSet = new HashSet<>();
            long currentSum = 0;
            boolean isValid = true;

            for (int j = i; j < i + k; j++) {
                if (windowSet.contains(nums[j])) {
                    isValid = false;
                    break; 
                }
                windowSet.add(nums[j]);
                currentSum += nums[j];
            }

            if (isValid) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}
