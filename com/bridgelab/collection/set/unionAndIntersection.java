package com.bridgelab.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class unionAndIntersection {

    public static Set<Integer> union( Set<Integer> set1, Set<Integer> set2){
        Set<Integer> ans = new HashSet<>(set1);
        for(Integer ele: set2){
            ans.add(ele);
        }
        return ans;
    }
    public static Set<Integer> intersection( Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersection = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {  // Check if num is present in both sets
                intersection.add(num);
            }
        }
        return intersection;
    }
    public static Set<Integer> symmetricDifference( Set<Integer> set1, Set<Integer> set2){
        Set<Integer> symmetricdiff = new HashSet<>(set2);
        for (int num : set1) {
            if (!set2.contains(num)) {  // Check if num is present in both sets
                symmetricdiff.add(num);
            }else{
                symmetricdiff.remove(num);
            }
        }
        return symmetricdiff;
    }

    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>(); 
        Set<Integer> set2 = new HashSet<>(); 

        Scanner sc = new Scanner(System.in);
        int n = 0;

       
        System.out.println("Enter number in set1  (-1 for exit)");
        while (true) {
            n = sc.nextInt();
            if(n==-1) break;
            set1.add(n);
        }

        System.out.println("Enter number in set2  (-1 for exit)");
        while (true) {
            n = sc.nextInt();
            if(n==-1) break;
            set2.add(n);
        }

        System.out.println(set1);
        System.out.println(set2);
        System.out.println("Union of two sets: "+ union(set1,set2));
        System.out.println("Intersection of two sets: "+ intersection(set1,set2));
        System.out.println("sydsfhskl of two sets: "+ symmetricDifference(set1,set2));


    }
}

