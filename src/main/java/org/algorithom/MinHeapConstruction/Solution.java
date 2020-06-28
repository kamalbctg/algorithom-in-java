package org.algorithom.MinHeapConstruction;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //childOne:(2i+1/)2, childOne:(2i+2/)2, parent=(i-1)/2
    static class MinHeap {
        List<Integer> heap = new ArrayList<>();

        public MinHeap(List<Integer> array) {
            heap = buildHeap(array);
        }

        //T: O(n) S: O(1)
        public List<Integer> buildHeap(List<Integer> array) {
            int parentIndex = (array.size() - 1) / 2;
            for (int i = parentIndex; i >= 0; i--) {
                siftDown(i, array.size() - 1, array);
            }
            return array;
        }

        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            int childOneIdx = 2 * currentIdx + 1;
            while (childOneIdx <= endIdx) {
                int childTwoIdx = ((2 * currentIdx + 2) <= endIdx) ? (2 * currentIdx + 2) : -1;
                int idxToSwap = (childTwoIdx != -1 && heap.get(childTwoIdx) < heap.get(childOneIdx)) ? childTwoIdx : childOneIdx;
                if (heap.get(idxToSwap) < heap.get(currentIdx)) {
                    swap(currentIdx, idxToSwap, heap);
                    currentIdx = idxToSwap;
                    childOneIdx = 2 * currentIdx + 1;
                } else {
                    break;
                }
            }

        }

        public void siftUp(int currentIdx, List<Integer> heap) {
            int parentIdx = (currentIdx - 1) / 2;
            while (currentIdx > 0 && heap.get(currentIdx) < heap.get(parentIdx)) { // not at top and current is less compare tor parent
                swap(currentIdx, parentIdx, heap);
                currentIdx = parentIdx;
                parentIdx = (currentIdx - 1) / 2;
            }
        }

        private void swap(int i, int j, List<Integer> heap) {
            int tmp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, tmp);
        }

        public int peek() {
            return heap.get(0);
        }

        public int remove() {
            swap(0, heap.size() - 1, heap);
            int removed = heap.remove(heap.size() - 1);
            siftDown(0, heap.size() - 1, heap);
            return removed;
        }

        public void insert(int value) {
            heap.add(value);
            siftUp(heap.size() - 1, heap);
        }
    }
}
