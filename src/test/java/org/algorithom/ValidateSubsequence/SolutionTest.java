package org.algorithom.ValidateSubsequence;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    Integer[][] input = {
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {1, 1, 1, 1, 1},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {1, 1, 6, 1},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 25, 6, -1, 8, 10}
    };

    Integer[][] sequence = {
            {1, 6, -1, 10},
            {5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 6, -1, 8, 10},
            {22, 25, 6},
            {1, 6, 10},
            {5, 1, 22, 10},
            {5, -1, 8, 10},
            {25},
            {1, 1, 1},
            {5, 1, 22, 25, 6, -1, 8, 10, 12},
            {4, 5, 1, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 23, 6, -1, 8, 10},
            {5, 1, 22, 22, 25, 6, -1, 8, 10},
            {5, 1, 22, 22, 6, -1, 8, 10},
            {1, 6, -1, -1},
            {1, 6, -1, -1, 10},
            {1, 6, -1, -2},
            {26},
            {5, 1, 25, 22, 6, -1, 8, 10,},
            {5, 26, 22, 8},
            {1, 1, 1, 6},
            {1, 6, -1, 10, 11, 11, 11, 11},
            {5, 1, 22, 25, 6, -1, 8, 10, 10}

    };


    boolean[] expected = {true, true, true, true, true, true, true, true,
            true, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false};

    @Test
    public void whileLoopSolution1Test() {
        for (int i = 0; i < input.length; i++) {
            boolean actual = Solution.isValidSubsequence(Arrays.asList(input[i]), Arrays.asList(sequence[i]));
            System.out.println(i + " " + expected[i] + "--->" + actual);
            Assert.assertEquals(expected[i], actual);
        }
    }

}