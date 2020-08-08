package org.algorithom.Knapsack;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EqualSumPartition {
    public static void main(String[] args) {
        System.out.println(hasEqualSumPartition(new int[]{1, 5, 11, 5}));
        System.out.println(hasEqualSumPartition(new int[]{1, 5, 3}));
    }

    private static boolean hasEqualSumPartition(int[] numbers) {
        int sum = IntStream.of(numbers).sum();  // s1 + s2 = sum
        if(sum % 2 !=0 ) return false;
        int s1 = sum/2;  // equal partition = sum / 2
        return SubsetSum.hasSubSet(numbers,s1);
    }
}
