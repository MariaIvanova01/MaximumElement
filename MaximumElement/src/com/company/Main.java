package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countCommands = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countCommands; i++) {
            int[] inputCommands = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (inputCommands[0] == 1){
                stack.push(inputCommands[1]);
            }
            if (inputCommands[0] == 2) {
                stack.pop();
            }
            if (inputCommands[0] == 3){
                System.out.println(Collections.max(stack));
            }
        }

    }
}
