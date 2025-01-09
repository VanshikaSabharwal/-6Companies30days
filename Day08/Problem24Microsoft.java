// problem:- Longest Mountain in Array 

class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int res = 0;

        if(n<3){
            return 0;
        }

        for(int i = 1; i< n-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
               
               int mountain = 1;
             
               
               int left = i-1;
               int right = i+1;

               while(left>=0 && arr[left]<arr[left+1]){
                mountain++;
                left--;
               }

               while(right<n && arr[right]<arr[right-1]){
                mountain++;
                right++;
               }
            res = Math.max(mountain,res);
            
            }
        }
        return res;
    }
}