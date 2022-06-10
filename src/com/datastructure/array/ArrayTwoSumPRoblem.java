package com.datastructure.array;

import java.util.Arrays;

public class ArrayTwoSumPRoblem {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,10};
        int sum = 15;
        int i = 0;
        int j = input.length-1;
        Arrays.sort(input);
        do{
            int localSum = input[i] + input[j];
            if(sum == localSum){
                break;
            }else if(sum > localSum){
                i++;
            }else {
                j--;
            }
        }while (i<= j);

        if(i>j){
            System.out.println("NotFound");
        }else{
            System.out.println("i = "+i+"\tj = "+j);
        }
    }
}