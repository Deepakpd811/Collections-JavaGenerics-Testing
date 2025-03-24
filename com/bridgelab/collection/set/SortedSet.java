package com.bridgelab.collection.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {

    public static Set<Integer> sortedSet(Set<Integer> set) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        for (Integer ele : set)
            sortedSet.add(ele);
        return sortedSet;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        int n = 0;

        System.out.println("Enter number in set1  (-1 for exit)");
        while (true) {
            n = sc.nextInt();
            if (n == -1)
                break;
            set1.add(n);
        }

        System.out.println("Sorted set: " + sortedSet(set1));

    }

}
