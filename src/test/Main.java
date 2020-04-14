package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str1 = s.split(" ");
        int[] weights = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            weights[i] = Integer.parseInt(str1[i]);
        }
        int maxLoad = Integer.parseInt(br.readLine());
        int count = countLeastBoat(weights, maxLoad);
        System.out.println(count);
    }

    public static int countLeastBoat(int[] weights, int maxLoad) {
        if (weights == null || weights.length == 0 || maxLoad <= 0) return 0;
        Arrays.sort(weights);
        int begin = 0;
        int end = weights.length - 1;
        int ret = 0;
        while (begin <= end) {
            if ((weights[begin] + weights[end]) <= maxLoad) {
                begin++;
                end--;
            } else {
                end--;
            }
            ret++;
        }
        return ret;
    }
}