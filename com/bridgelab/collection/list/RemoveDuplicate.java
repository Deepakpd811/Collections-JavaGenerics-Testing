package com.bridgelab.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {

    public static void removeDuplicate(List<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 2; i++) {
            if (list.get(i) == list.get(i + 1)) {
                list.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter number for exit enter -1");

        // take user input
        while (true) {
            n = sc.nextInt();
            if (n == -1) {
                break;
            }
            list.add(n);
        }

        removeDuplicate(list);

        System.out.println(list);

        sc.close();

    }
}
