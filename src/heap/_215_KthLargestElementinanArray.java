package heap;

import java.util.PriorityQueue;

/**
 * @date 2019/10/8 21:38
 */
public class _215_KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        //使用优先队列实现堆，注意优先队列的方法，默认是小顶堆，即 a - b
        //大顶堆是 b - a
        //peek() offer() poll()
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> a - b);
        for (int num : nums) {
            if (heap.size() < k) {
                heap.offer(num);
            } else {
                if (heap.peek() < num) {
                    heap.poll();
                    heap.offer(num);
                }
            }
        }
        return heap.poll();
    }
}
