package com.datastructure.array;

import java.util.Arrays;

public class ArraySearchInsertPosition {
    public static void main(String[] args) {
        // int arr[] = {1,3,5,6};
        int arr[] = {1,3};
        int target = 5;
        
        int mid = 0;
        mid = binarySearch(arr, target);

        System.out.println("Index : "+mid);

        int newMid = ArraySearchInsertPosition
            .advanceSearch(arr, target);
        System.out.println("New mid : "+newMid);

        int index = Arrays.binarySearch(arr, target);
        System.out.println("Index : "+index);

    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        if(target > arr[high]){
            return high +1;
        }else if(target < arr[low]){
            return low;
        }
        int mid = 0;
        int count  = 0;
        boolean found = false;
        while(low <= high){
            mid = low + (high-low)/2;
            System.out.println("Count : "+(++count)+
            "\tLow : "+low+
            "\tMid : "+mid+
            "\tHigh : "+high);
            if(target == arr[mid]){
                found = true;
                break;
            }else if(target > arr[mid]){
                low = mid+1;
            }else {
                high = mid-1;
            }
            

        }
        if(!found){
            if(target > arr[mid]){
                mid += 1;
            }
        }
        return mid;
    }

    public static int advanceSearch(int [] nums,  int target) {
        int result = Arrays.binarySearch(nums, target);
        return result < 0 ? (result * -1) -1 : result;
    }
}
