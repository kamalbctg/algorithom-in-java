package org.algorithom.Knapsack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<List<Integer>> knapsack(int[][] items, int capacity) {
        int[][] knapsack = new int[items.length+1][capacity+1];

        for (int r = 1; r < knapsack.length; r++){
            int w = items[r-1][1];
            int v = items[r-1][0];
            for (int c =0; c<knapsack[0].length; c++){
                if(c < w){
                    knapsack[r][c]= knapsack[r-1][c];
                } else {
                    knapsack[r][c] = Math.max(knapsack[r-1][c],
                            knapsack[r-1][c-w]+v);
                }
            }
        }

        int r= knapsack.length-1;
        int c= knapsack[0].length-1;
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(Arrays.asList(knapsack[r][c])));
        result.add(new ArrayList<>());
        while (r>0){
            if(c == 0) break;
            if(knapsack[r][c] == knapsack[r-1][c]){
                r--;
            } else{
                int itemIdx = r-1;
                result.get(1).add(0,itemIdx);
                c-=items[itemIdx][1];
            }
        }
        return result;
    }
}
