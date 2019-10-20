package search;

import javafx.util.Pair;

import java.util.*;

public class _127_WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String, ArrayList<String>> graph = new HashMap<>();
        constructGraph(beginWord, wordList, graph);
        return BFSGraph(beginWord, endWord, graph);
    }

    //BFS
    public static int BFSGraph(String beginWord, String endWord, HashMap<String, ArrayList<String>> graph) {
        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        queue.offer(new Pair<>(beginWord, 1));
        visited.add(beginWord);
        while (!queue.isEmpty()) {
            Pair<String, Integer> pair = queue.poll();
            String node = pair.getKey();
            Integer step = pair.getValue();
            //此处字符串比较需要 equals 方法
            if (node.equals(endWord)) {
                return step;
            }
            ArrayList<String> strings = graph.get(node);
            for (String s : strings) {
                if (!visited.contains(s)) {
                    queue.add(new Pair<>(s, step + 1));
                    visited.add(s);
                }
            }
        }
        return 0;
    }

    //判断单词之间是否有联系，有联系的将成为绘图的边
    public static boolean connect(String word1, String word2) {
        int res = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) res++;
        }
        return res == 1;
    }

    //构建图
    public static void constructGraph(String beginWord, List<String> wordList, HashMap<String, ArrayList<String>> graph) {
        wordList.add(beginWord);
        for (int i = 0; i < wordList.size(); i++) {
            graph.put(wordList.get(i), new ArrayList<>());
        }
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (connect(wordList.get(i), wordList.get(j))) {
                    graph.get(wordList.get(i)).add(wordList.get(j));
                    graph.get(wordList.get(j)).add(wordList.get(i));
                }
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
        int result = ladderLength(beginWord, endWord, wordList);
        System.out.println(result);
    }
}
