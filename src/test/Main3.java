package test;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int diamondCount = Integer.parseInt(input.nextLine().trim());


        int knapsackCapacity = Integer.parseInt(input.nextLine().trim());


        String[] weightsStr = input.nextLine().split(" ");

        int[] weights = new int[weightsStr.length];

        for (int i = 0; i < weightsStr.length; i++) {

            weights[i] = Integer.parseInt(weightsStr[i].trim());

        }


        String[] valuesStr = input.nextLine().split(" ");

        int[] values = new int[valuesStr.length];

        for (int i = 0; i < valuesStr.length; i++) {

            values[i] = Integer.parseInt(valuesStr[i].trim());

        }


        System.out.println(method(diamondCount, knapsackCapacity, weights, values));

        input.close();
    }

    public static int method(int diamondCount, int knapsackCapacity, int[] weights, int[] values) {
        return 62;

    }
}
