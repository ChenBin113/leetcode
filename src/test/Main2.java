package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int calcMinStaff(int[][] phoneTime, int length) {
        int res = 0;
        int count;
        for (int i = 0; i < length; i++) {
            count = 0;
            int checkNumber = phoneTime[i][0];
            for (int j = 0; j < length; j++) {
                if (checkNumber >= phoneTime[j][0] && checkNumber < phoneTime[j][1]) {
                    count++;
                }
            }
            if (count > res) {
                res = count;
            }
        }

        return res;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int count;
        count = Integer.parseInt(in.nextLine());

        int[][] phoneTime = new int[count][2];

        for (int i = 0; i < count; i++) {
            String[] split = in.nextLine().split(",");
            for (int j = 0; j < 2; j++) {
                phoneTime[i][j] = Integer.parseInt(split[j]);
            }
        }

        int res;
        res = calcMinStaff(phoneTime, count);
        System.out.println(String.valueOf(res));

    }
}

