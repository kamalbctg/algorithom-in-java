package org.algorithom.Knapsack;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RodCuting {
    public static void main(String[] args) {
        int n= 8;
        int[] prices = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int[] wts = IntStream.range(0, n).boxed().mapToInt(value -> value+1).toArray();
        System.out.println(UnboundedKnapsack.knapsack((int[]) wts, prices, n));
    }
}
