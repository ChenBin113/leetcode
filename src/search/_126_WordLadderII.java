package search;

import util.Qitem;

import java.util.*;

public class _126_WordLadderII {
    /**
     * 1. 记录路径的宽搜
     *      使用的结构具备前驱，可以查找路径
     * 2. 多条路径的保存
     *      使用了一个链表保存多条路径的最终位置，通过前驱可以还原成一整条路径
     * 3. 如果 beginWord 在 wordList 中已经存在，如何构图
     */
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        return res;
    }

    public void BFS_graph(String beginWord, String endWord, Map<String, LinkedList<String>> graph, LinkedList<Qitem> queue, LinkedList<Integer> end_word_pos) {
        HashMap<String, Integer> visit = new HashMap<>(); //记录 <word, step>
        int min_step = 0;
        queue.offer(new Qitem(beginWord, -1, 1));
        visit.put(beginWord, 1); //标记起始单词步数为 1
        int front = 0; //队列头指针 front，指向 queue 表示的队列头
        while (queue.size() > front + 1) {
            String node = queue.get(front).node;
            int step = queue.get(front).step;
            if (min_step != 0 && min_step < step) {
                break;
            }
            if (node == endWord) {
                min_step = queue.get(front).step;
                end_word_pos.add(front);
            }
            LinkedList<String> neighbors = graph.get(node);
            for (int i = 0; i < neighbors.size(); i++) {
                if (visit.getOrDefault(neighbors.get(i), -1) == -1 || visit.get(neighbors.get(i)) == step + 1) {
                    queue.push(new Qitem(neighbors.get(i), front, step + 1));
                    visit.put(neighbors.get(i), step + 1);
                }
            }
            front++;
        }
    }
}
