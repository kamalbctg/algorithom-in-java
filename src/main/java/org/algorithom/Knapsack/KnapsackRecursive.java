package org.algorithom.Knapsack;

public class KnapsackRecursive {
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }

    private static int knapSack(int w, int[] wt, int[] val, int n) {
        if (n == 0 || w == 0)
            return 0;
        int weight = wt[n-1];
        int v =val[n-1];
        if (weight > w) {
            return knapSack(w, wt, val, n - 1);
        } else{
            return Math.max(v+ knapSack(w-weight, wt, val, n-1),
                    knapSack(w, wt, val, n - 1));
        }
    }
}
