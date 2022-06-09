package com.datastructure.array;

import java.util.stream.IntStream;

public class ArrayMissingNum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = 5;
        System.out.println("N : "+n);
        int sum = IntStream.range(0, n+1).sum();
        // int sum=(n*(n+1))/2;
        int inputSum = 0;
        for(int num : arr){
            inputSum += num;
        }
        System.out.println("Total Sum : "+sum);
        System.out.println("Input num Sum : "+inputSum);
        int missingNum = sum-inputSum;
        System.out.println("Missing Num : "+missingNum);
    }
}
