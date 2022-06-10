package com.datastructure.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySumOfTwoArray {
    public static void main(String[] args) {
        int[] a = {2, 2, 7, 5, 3, 3};
        int[] b = {4, 3, 3, 8};
        int i = a.length - 1;
        int j = b.length - 1;
        int sum = 0;
        int carry = 0;
        List<Integer> result = new ArrayList<>();
        while(i >= 0 || j >= 0){
            int a2 = 0;
            int b2 = 0;
            if(i >= 0)
                a2 = a[i];
            if(j >= 0)
                b2 = b[j];
            sum = a2 + b2 + carry;
            result.add(sum%10);
            carry = sum / 10;
            i--;
            j--;
        }
        if(carry > 0)
            result.add(carry);
        Collections.reverse(result);
        System.out.println(result);
    }
}