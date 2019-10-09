package heap;

import java.util.PriorityQueue;

/**
 * @date 2019/10/9 0:51
 */
public class _295_FindMedianfromDataStream {
    PriorityQueue<Integer> small_heap;
    PriorityQueue<Integer> big_heap;

    /** initialize your data structure here. */
    public _295_FindMedianfromDataStream() {
        small_heap = new PriorityQueue<>();
        big_heap = new PriorityQueue<>((a, b) -> b - a);
    }

    public void addNum(int num) {
        if (big_heap.isEmpty() && small_heap.isEmpty()) {
            big_heap.offer(num);
            return;
        }
        if (big_heap.size() == 1 && small_heap.isEmpty()) {
            if (big_heap.peek() > num) {
                small_heap.offer(big_heap.poll());
                big_heap.offer(num);
            } else {
                small_heap.offer(num);
            }
            return;
        }
        //当堆为空时，num 和 堆内元素比较会出现空指针错误
        if (small_heap.size() == big_heap.size()) {
            if (num < big_heap.peek()) {
                big_heap.offer(num);
            } else {
                small_heap.offer(num);
            }
        } else if (small_heap.size() < big_heap.size()) {
            if (num > big_heap.peek()) {
                small_heap.offer(num);
            } else {
                small_heap.offer(big_heap.peek());
                big_heap.poll();
                big_heap.offer(num);
            }
        } else {
            if (num < small_heap.peek()) {
                big_heap.offer(num);
            } else {
                big_heap.offer(small_heap.peek());
                small_heap.poll();
                small_heap.offer(num);
            }
        }
    }

    public double findMedian() {
        double res;
        if (small_heap.size() == big_heap.size()) {
            res = (small_heap.peek() + big_heap.peek()) / 2.0;
        } else if (small_heap.size() > big_heap.size()) {
            res = small_heap.peek();
        } else {
            res = big_heap.peek();
        }
        return res;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */