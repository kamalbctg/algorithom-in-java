package org.algorithom.BirthdayCakeCandles;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static int birthdayCakeCandles(int[] arr) {
        int maxHeight = Integer.MIN_VALUE;
        int counter = 0;
        for (int height : arr) {
            if (height > maxHeight) {
                maxHeight = height;
                counter = 0;
            }
            if (height == maxHeight) {
                counter++;
            }
        }
        int[] a= new int[]{5,6,7} ;
        int[] b = new int[]{3,6,10};
        //Arrays.asList(new Integer()[]{1,3})
        return counter;
    }
}
