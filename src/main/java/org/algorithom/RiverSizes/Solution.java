package org.algorithom.RiverSizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> sizes = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (visited[r][c] == true) continue;
                traverseNodes(r, c, matrix, visited, sizes);
            }
        }
        return sizes;
    }

    private static void traverseNodes(int r, int c, int[][] matrix, boolean[][] visited, List<Integer> sizes) {
        int riverSize = 0;
        Stack<Integer[]> nodes = new Stack<>();
        nodes.add(new Integer[]{r, c});
        while (!nodes.isEmpty()) {
            Integer[] currentNode = nodes.pop();
            if (visited[currentNode[0]][currentNode[1]] == true) continue;
            visited[currentNode[0]][currentNode[1]] = true;
            if (matrix[currentNode[0]][currentNode[1]] == 0) continue;
            riverSize++;
            nodes.addAll(unvisitedNeighbors(currentNode[0], currentNode[1], matrix, visited));
        }
        if (riverSize > 0) sizes.add(riverSize);
    }

    private static Stack<Integer[]> unvisitedNeighbors(Integer r, Integer c, int[][] matrix,
                                                       boolean[][] visited) {
        Stack<Integer[]> neighbors = new Stack<>();
        if (r > 0 && !visited[r - 1][c])
            neighbors.add(new Integer[]{r - 1, c});
        if (r < matrix.length - 1 && !visited[r + 1][c])
            neighbors.add(new Integer[]{r + 1, c});
        if (c > 0 && !visited[r][c - 1])
            neighbors.add(new Integer[]{r, c - 1});
        if (c < matrix[0].length - 1 && !visited[r][c + 1])
            neighbors.add(new Integer[]{r, c + 1});
        return neighbors;
    }
}
