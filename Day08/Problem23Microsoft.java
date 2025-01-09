// problem:- Nuts and Bolts Problem

class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
       boolean[] freq = new boolean[256];
       
       for(int c:nuts){
           freq[c] = true;
       }
       
       int index = 0;
       for(int i = 0; i<256; i++){
           if(freq[i]){
               nuts[index] = (char) i;
               bolts[index++] = (char) i;
           }
       }
       
     
    }
}