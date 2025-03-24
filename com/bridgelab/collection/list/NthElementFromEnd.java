package com.bridgelab.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class NthElementFromEnd {

    public static String findNthElementFromEnd(List<String> list, int N) {

        if (list == null) {
            return "list is empty";
        }
        ListIterator<String> first = list.listIterator();
        ListIterator<String> second = list.listIterator();


        // Move the first pointer by N times
        for (int i = 0; i < N; i++) {
            first.next();
        }

        // Move the both pointer until first reach the null
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        String str = "";

        // Take string from user
        while (true) {
            str = sc.next();
            if (str.equals("exit"))
                break;
            list.add(str);
        }

        System.out.println("Enter N index ");
        int N = sc.nextInt();

        String nthElemnt = findNthElementFromEnd(list, N);

        System.out.println(nthElemnt);

    }
}
