// problem:- Shopping Offers

import java.util.*;

class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return dfs(price, special, needs, new HashMap<>());
    }

    private int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, Map<List<Integer>, Integer> memo) {
        if (memo.containsKey(needs)) return memo.get(needs);
        
        int n = price.size();
        int minCost = 0;
        
        for (int i = 0; i < n; i++) {
            minCost += needs.get(i) * price.get(i);
        }
        
        // Try using each special offer
        for (List<Integer> offer : special) {
            boolean valid = true;
            List<Integer> newNeeds = new ArrayList<>(needs);
            
            // Check if the special offer can be applied
            for (int i = 0; i < n; i++) {
                if (offer.get(i) > newNeeds.get(i)) {
                    valid = false;
                    break;
                }
                newNeeds.set(i, newNeeds.get(i) - offer.get(i));
            }
            
            // If the offer is valid, calculate the cost using it
            if (valid) {
                minCost = Math.min(minCost, offer.get(n) + dfs(price, special, newNeeds, memo));
            }
        }
        
        // Store the result in memo and return
        memo.put(needs, minCost);
        return minCost;
    }
}
