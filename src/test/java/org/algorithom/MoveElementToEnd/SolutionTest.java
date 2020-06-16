package org.algorithom.MoveElementToEnd;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        List<Integer> actual = Solution.moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2), 2);
        assertEquals(Arrays.asList(4, 1, 3, 2, 2, 2, 2, 2), actual);
    }

    @Test
    public void test2() {
        List<Integer> actual = Solution.moveElementToEnd(Arrays.asList(3, 3, 3, 3, 3), 3);
        assertEquals(Arrays.asList(3, 3, 3, 3, 3), actual);
    }
    @Test
    public void test3() {
        List<Integer> actual = Solution.moveElementToEnd(Arrays.asList(5, 5, 5, 5, 5, 5, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12), 5);
        assertEquals(Arrays.asList(12, 11, 10, 9, 8, 7, 1, 2, 3, 4, 6, 5, 5, 5, 5, 5, 5), actual);
    }
}