package com.bridgelab.inputOutputStreams;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String filename = "wordfrequency.txt"; // Replace with your file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            Map<String, Integer> wordCounts = new HashMap<>();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split(" "); // Split into words, lowercase
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort words by frequency
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCounts.entrySet());
            System.out.println(sortedWords);
            sortedWords.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            // Display top 5 words
            System.out.println("Top 5 most frequent words:");
            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedWords) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                count++;
                if (count == 5) {
                    break;
                }
            }
            long totalWords = 0;
            for(int val : wordCounts.values()){
                totalWords += val;
            }

            System.out.println("Total word count: " + totalWords);
            System.out.println("Unique word count: " + wordCounts.size());

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}