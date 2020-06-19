package org.algorithom.NthFibonacci;

public class Solution2 {
    public static int getNthFib(int n) {
        int[] lastTwoFibs = new int[]{0, 1};
        int counter = 3;
        while (counter <= n) {
            int nextFib = lastTwoFibs[1] + lastTwoFibs[1];
            lastTwoFibs[0] = lastTwoFibs[1];
            lastTwoFibs[1] = nextFib;
        }
        return n > 1 ? lastTwoFibs[1] : lastTwoFibs[0];
    }
}
