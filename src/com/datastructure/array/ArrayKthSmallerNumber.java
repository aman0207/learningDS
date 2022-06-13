package com.datastructure.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ArrayKthSmallerNumber {

    public int kthSmallest(int[][] matrix, int k) {
        int totlaSize = matrix.length * matrix[0].length;
        int[] a = new int[totlaSize];
        int counter = 0;
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                a[counter++] = matrix[i][j];
            }
        }
        Arrays.sort(a);
        return a[k-1];
    }

    public int kthSmallest2(int[][] matrix, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a1,b1) -> {
        //     return b1 - a1;
        // });

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            Collections.reverseOrder());

        
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                pq.offer(matrix[i][j]);
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
        System.out.println("Element of Priority Queue : "+pq);
        return pq.poll();
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        // int[][] matrix = {{-5}};


        ArrayKthSmallerNumber ob= new ArrayKthSmallerNumber();
        System.out.println("Result = "
        +ob.kthSmallest2(matrix, 8));

    }
}
