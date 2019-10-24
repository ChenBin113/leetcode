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
    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashMap<String, List<String>> graph = new HashMap<>();
        constructGraph(beginWord, wordList, graph);
        LinkedList<Qitem> queue = new LinkedList<>();
        LinkedList<Integer> end_word_pos = new LinkedList<>();
        BFS_graph(beginWord, endWord, graph, queue, end_word_pos);
        List<List<String>> result = new LinkedList<>();
        for (int i = 0; i < end_word_pos.size(); i++) {
            int pos = end_word_pos.get(i);
            LinkedList<String> path = new LinkedList<>();
            while (pos != -1) {
                path.add(0, queue.get(pos).node);
                pos = queue.get(pos).parent_pos;
            }
            result.add(path);
        }
        return result;
    }

    public static void BFS_graph(String beginWord, String endWord, HashMap<String, List<String>> graph, LinkedList<Qitem> queue, LinkedList<Integer> end_word_pos) {
        HashMap<String, Integer> visit = new HashMap<>(); //记录 <word, step>
        int min_step = 0;
        queue.offer(new Qitem(beginWord, -1, 1));
        visit.put(beginWord, 1); //标记起始单词步数为 1
        int front = 0; //队列头指针 front，指向 queue 表示的队列头
        while (queue.size() != front) {
            String node = queue.get(front).node;
            int step = queue.get(front).step;
            if (min_step != 0 && min_step < step) {
                break;
            }
            if (node == endWord) {
                min_step = step;
                end_word_pos.add(front);
            }
            List<String> neighbors = graph.get(node);
            for (int i = 0; i < neighbors.size(); i++) {
                if (visit.getOrDefault(neighbors.get(i), -2) == -2 || visit.get(neighbors.get(i)) == step + 1) {
                    queue.addLast(new Qitem(neighbors.get(i), front, step + 1));
                    visit.put(neighbors.get(i), step + 1);
                }
            }
            front++;
        }
    }

    //判断单词之间是否有联系，有联系的将成为绘图的边
    public static boolean connect(String word1, String word2) {
        int res = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) res++;
        }
        return res == 1;
    }

    //构建图，如果 wordList 中有 beginWord 情况需要考虑
    public static void constructGraph(String beginWord, List<String> wordList, HashMap<String, List<String>> graph) {
        int has_begin_word = 0;
        for (int i = 0; i < wordList.size(); i++) {
            if (beginWord.equals(wordList.get(i))) {
                has_begin_word = 1;
            }
            graph.put(wordList.get(i), new LinkedList<>());
        }
        if (has_begin_word != 1) {
            graph.put(beginWord, new LinkedList<>());
        }
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (connect(wordList.get(i), wordList.get(j))) {
                    graph.get(wordList.get(i)).add(wordList.get(j));
                    graph.get(wordList.get(j)).add(wordList.get(i));
                }
            }
            if (has_begin_word == 0 && connect(beginWord, wordList.get(i))) {
                graph.get(beginWord).add(wordList.get(i));
            }
        }
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        List<List<String>> result = findLadders(beginWord, endWord, wordList);
        System.out.println(result);
    }
}
