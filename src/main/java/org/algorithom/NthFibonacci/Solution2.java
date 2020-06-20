package org.algorithom.NthFibonacci;

public class Solution2 {
    //Time: O(n)
    //Space: O(1)
    public static int getNthFib(int n) {
        int[] lastTwoFib = new int[]{0, 1};
        int i = 3;
        while (n >= i) {
            int nextFib = lastTwoFib[0] + lastTwoFib[1];
            lastTwoFib[0] = lastTwoFib[1];
            lastTwoFib[1] = nextFib;
            i++;
        }
        return (n > 1) ? lastTwoFib[1] : lastTwoFib[0];
    }
}
