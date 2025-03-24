package com.bridgelab.collection.Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class CountWordFile {
    public static void main(String[] args) {

        String filepath = "myfile.txt";

        try {

            FileReader fr = new FileReader(filepath);

            BufferedReader br = new BufferedReader(fr);
            
            Map<String,Integer> map = new HashMap<>();

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                String[] word = line.split(" ");

                for (int i = 0; i < word.length; i++) {
                   map.put(word[i], map.getOrDefault(word[i], 0)+1);
                }

            }

           System.out.println(map);

        } catch (Exception e) {
           
            System.out.println("Exception: " + e);
        }

    }
}