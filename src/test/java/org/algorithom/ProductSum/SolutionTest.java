package org.algorithom.ProductSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SolutionTest {
    @Test
    public void productSum() {
        //[5, 2, [7, -1], 3, [6, [-13, 8], 4]]}
        Assert.assertEquals(12,
                Solution.productSum(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<>(
                                        Arrays.asList(
                                                6,
                                                new ArrayList<>(Arrays.asList(-13, 8)),
                                                4)
                                )
                        )
                )
        );
    }

    @Test
    public void test2() {
        //1, 2, 3, 4, 5
        Assert.assertEquals(15, Solution.productSum(Arrays.asList(1, 2, 3, 4, 5))
        );
    }
}