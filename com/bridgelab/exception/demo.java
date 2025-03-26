package com.bridgelab.exception;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8};
        int k =3;
        int idx=0;
        // int i=0;

        List<List<Integer>> ls = new ArrayList<>();

        for(int i=0; i<arr.length; i+=k){
            int count =k;
            ArrayList<Integer> temp = new ArrayList<>();

            while(count!=0){
                if(idx<arr.length-1){
                    temp.add(arr[idx++]);
                }
                count--;
            }
            
            ls.add(temp);

        }

        System.out.println(ls);

    }
}
