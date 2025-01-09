// Problem: - Wiggle Sort II

import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);

        int[] temp = new int[nums.length];
        
        int n = nums.length;
        int mid = (n - 1) / 2; 
        int high = n - 1;      

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                temp[i] = nums[mid--]; 
            } else {
                temp[i] = nums[high--]; 
            }
        }

        // Copy the result back to nums
        System.arraycopy(temp, 0, nums, 0, n);
    }
}
