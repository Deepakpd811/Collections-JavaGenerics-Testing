package com.bridgelab.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MergeMap {

    public static Map<String, Integer> mergeMap(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (result.containsKey(key)) {
                result.put(key, result.get(key) + value);  // Sum values if key exists
            } else {
                result.put(key, value);  // Add new key-value pair
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
          // Create a HashMap
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("B", 20);
        map1.put("A", 10);
        map1.put("C", 15);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("D", 20);
        map2.put("E", 10);
        map2.put("B", 33);

        // Merge two maps
        
        Map<String, Integer> map3 = mergeMap(map1, map2);

        System.out.println(map3);

    }
}
