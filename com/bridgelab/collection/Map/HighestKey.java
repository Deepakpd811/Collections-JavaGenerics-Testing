package com.bridgelab.collection.Map;

import java.util.HashMap;
import java.util.Map;

// Find the Key with the Highest Value
// Given a Map<String, Integer>, find the key with the maximum value.
// Example:
// Input: {A=10, B=20, C=15} → Output: B.

public class HighestKey {
    public static void main(String[] args) {

        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("B", 20);
        map.put("A", 10);
        map.put("C", 15);

        // Find the key with the maximum value
        String key = "";

        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }

        System.out.println(key);
    }
}
