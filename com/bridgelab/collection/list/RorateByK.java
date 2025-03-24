package com.bridgelab.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RorateByK {

    // Method to reverse an arraylist
    public static void reverse(List<Integer> arr, int start, int last){
        while(start<last){
            int temp =arr.get(start);
            arr.set(start, arr.get(last));
            arr.set(last, temp);
            start++;
            last--;
        }
    }

    // method to rotate by k times
    public static void rotate(List<Integer> list, int k){
        int n = list.size()-1;
        reverse(list, 0, n);
        reverse(list, 0, k);
        reverse(list, k+1, n);
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

        System.out.println("Enter rotate number ");
        int k = sc.nextInt();

        rotate(list, k);

        System.out.println(list);

        sc.close();

    }
}
