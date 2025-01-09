// Problem :- Count the Number of Incremovable Subarrays 

class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i< n ; i++){
            for(int j = i; j< n ; j++){
                if(isIncremovableSubarray(nums,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isIncremovableSubarray(int[] arr, int start, int end){
        int n = arr.length;
        int prev = 0;

        for(int i = 0; i<n; i++){
            if(i<=end && i>=start){
                continue;
            }
            if(arr[i]<=prev){
                return false;
            }
            prev = arr[i];
        }
        return true;
    }
}