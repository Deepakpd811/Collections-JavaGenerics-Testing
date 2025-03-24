package com.bridgelab.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Frequency {

    // Method to store the frequency of each element
    public static Map<String, Integer> findFrequency(Map<String, Integer> hs, List<String> list) {

        for (String ele : list) {
            hs.put(ele, hs.getOrDefault(ele, 0) + 1);
        }
        return hs;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = "";

        List<String> list = new ArrayList<>();
        System.out.println("Enter item in array (enter exit to return)");

        // Take item from user
        while (!str.equals("exit")) {
            str = sc.next();
            if (!str.equals("exit")) {

                list.add(str);
            }
        }

        // Create a HashMap to store frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();
        frequencyMap = findFrequency(frequencyMap, list);

        // Display the frequency count
        System.out.println("Frequency of elements: " + frequencyMap);

        sc.close();

    }
}
