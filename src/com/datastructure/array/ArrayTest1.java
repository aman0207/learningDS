package com.datastructure.array;

public class ArrayTest1 {
    static int num = 0;
    {
        num = 5;
    }
    static {
        num = 10;
    }
public static void main(String[] args) {
    ArrayTest1 ob = new ArrayTest1();
    // System.out.println("What is num :"+ob.num);
    System.out.println("What is num :"+num);
}
}
