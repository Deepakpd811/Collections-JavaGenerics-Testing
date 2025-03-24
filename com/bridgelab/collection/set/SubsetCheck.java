package com.bridgelab.collection.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubsetCheck {

    
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Input for Set 1
        System.out.println("Enter elements for Set 1 (enter -1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            set1.add(num);
        }

        // Input for Set 2
        System.out.println("Enter elements for Set 2 (enter -1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            set2.add(num);
        }

        // Check if Set 1 is a subset of Set 2
        boolean result = isSubset(set1, set2);
        System.out.println("Is Set1 a subset of Set2? " + result);

        sc.close();
    }
}
