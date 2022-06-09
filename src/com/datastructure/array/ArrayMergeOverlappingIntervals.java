package com.datastructure.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ArrayMergeOverlappingIntervals {
    public static void main(String[] args) {
        // int[][] input = {{6,8},{1,9},{2,4},{4,7}};
        int[][] input = {{1,3},{2,5},{7,9},{10,13},{12,18}};
        int output[][] = new int[input.length][input[0].length];
        // pureArrayApproachFailed(input, output);
        // output = arrayListApproach(input);
        output = stackApproach(input);
        int lenOutput = output.length;
        // System.out.println("length of output array : "+lenOutput);
        for(int i = 0; i < lenOutput; i++){
            System.out.println("["+
            output[i][0]+" , "+output[i][1]+"]");
        }
        

    }

    private static void pureArrayApproachFailed(int[][] input, int[][] output) {
        int n = input.length;

        //first sort input 
        
        output[0] = input[0];
        int j = 0;
        for(int i = 1; i<n; i++){
            if(output[j][1] > input[i][0]){
                output[j][1] = input[i][1];
                j++;
            }else {
                j++;
                output[j] = input[i];
            }
        }
    }

    public static int[][] arrayListApproach(int[][] intervals){
        Arrays.sort(intervals, 
            (a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        for(int[] element : intervals){
            if(result.isEmpty()){
                result.add(element);
            }else {
                int[] previousElement = result.get(result.size()-1);
                if(previousElement[1] >= element[0]){
                    previousElement[1] = Math.max(
                        previousElement[1], element[1]);
                }else
                    result.add(element);
            }
        }
        return result.toArray(new int[result.size()][]);
    }


    public static int[][] stackApproach(int[][] intervals){
        Arrays.sort(intervals, (a,b)->
        Integer.compare(a[0], b[0]));
        int i = 0;
        // System.out.println("***********************");
        Stack<int[]> stk = new Stack<>();
        // System.out.println("Stack initial size : "+stk.size());
        for(int[] element : intervals){
            if(stk.empty()){
                stk.push(element);
            }else {
                int[] preElement = stk.peek();
                if(preElement[1] >= element[0]){
                    int[] preEle = stk.pop();
                    preEle[1] = Math.max(preEle[1], 
                        element[1]);
                    stk.push(preEle);
                }else {
                    stk.push(element);
                }
            }
        }
        // System.out.println("Stack final size : "+stk.size());
        int[][] result = new int[stk.size()][];
        
        while(!stk.empty()){
            int[] ele = stk.pop();
            // System.out.print("[ "+ele[0]+" , "+ele[1]+" ]");
            result[i++] = ele;
        }
        // System.out.println("***********************");
        return result;
    }
}
