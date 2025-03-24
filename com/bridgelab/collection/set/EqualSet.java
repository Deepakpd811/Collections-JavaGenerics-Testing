package com.bridgelab.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EqualSet {

    public static boolean isEqualSet( Set<Integer> set1, Set<Integer> set2){
        // if(set1.size()!=set2.size()) return false;

        // for(Integer x: set2){
        //     if(!set1.contains(x)) return false;
        // }
        return set1.equals(set2);
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

        System.out.println("is two sets are equal: "+isEqualSet(set1,set2));


    }
}
