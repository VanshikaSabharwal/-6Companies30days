// Problem: - Maximum Product of the Length of Two Palindromic Subsequences

class Solution {
    public int maxProduct(String s) {
        int n = s.length();
        int[] longestPalindrome = new int[1 << n];

        for(int i = 1; i< (1<<n); i++){
            StringBuilder subseq = new StringBuilder();
            for(int j = 0; j<n ; j++){
                if((i & (1<<j)) != 0){
                    subseq.append(s.charAt(j));
                }
            }
            if(isPalindrome(subseq.toString())){
                longestPalindrome[i] = subseq.length();
            }
        }

        int maxProduct = 0;

        for(int j = 1; j< (1<<n); j++){
            for(int k = j+1; k < (1<<n); k++){
                if((j & k) == 0){
                    maxProduct = Math.max(maxProduct,longestPalindrome[j] * longestPalindrome[k]);
                }
            }
        }
        return maxProduct;
    }

    private boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    
    }
}
