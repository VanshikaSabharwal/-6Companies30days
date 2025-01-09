// Problem : -  Image Smoother

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;      
        int n = img[0].length;    
        int[][] result = new int[m][n];
        
        int[] directions = {-1, 0, 1};
    
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0, count = 0;
                for (int di : directions) {
                    for (int dj : directions) {
                        int ni = i + di;
                        int nj = j + dj;

                        if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                            sum += img[ni][nj];
                            count++;
                        }
                    }
                }
                
                result[i][j] = sum / count;
            }
        }
        
        return result;
    }
}
