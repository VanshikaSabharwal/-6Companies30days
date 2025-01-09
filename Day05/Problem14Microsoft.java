// problem:- Random Point in Non-overlapping Rectangles

import java.util.*;

class Solution {
    private List<int[]> rects;  
    private int totalArea;     
    private List<Integer> areas; 
    
    public Solution(int[][] rects) {
        this.rects = new ArrayList<>();
        this.areas = new ArrayList<>();
        
        totalArea = 0;
        for (int[] rect : rects) {
            int area = (rect[2] - rect[0] + 1) * (rect[3] - rect[1] + 1);
            this.rects.add(rect);
            totalArea += area;
            areas.add(totalArea);
        }
    }
    
    public int[] pick() {
        Random rand = new Random();
        int randomArea = rand.nextInt(totalArea) + 1;
        
        // Step 2: Use binary search to find the rectangle corresponding to this area
        int left = 0, right = areas.size() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (areas.get(mid) < randomArea) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        // Step 3: The rectangle at index `left` is chosen
        int[] selectedRect = rects.get(left);
        
        // Step 4: Calculate the offset in the selected rectangle's area
        int offset = randomArea - (left == 0 ? 0 : areas.get(left - 1));
        
        // Step 5: Randomly pick a point inside the selected rectangle
        int width = selectedRect[2] - selectedRect[0] + 1;
        int height = selectedRect[3] - selectedRect[1] + 1;
        
        // Calculate random x, y coordinates inside the selected rectangle
        int x = selectedRect[0] + (offset - 1) % width;
        int y = selectedRect[1] + (offset - 1) / width;
        
        return new int[] {x, y};
    }
}
