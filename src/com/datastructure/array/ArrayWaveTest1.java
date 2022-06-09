package com.datastructure.array;

public class ArrayWaveTest1 {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5};
        //Output: 2 1 4 3 5 
        int arr[] = {2,4,7,8,9,10};
        //Output: 4 2 8 7 10 9
        //loop
        //swapleft
        //swapRight
        int n = (arr.length);
        System.out.println("N = "+n);
        waveSort(arr, n);

        for(int i =0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void waveSort(int[] arr, int n) {
        for(int i = 1; i< n ; i = i+2){
            if(arr[i] > arr[i-1]){
                //swapLeft
                swap(arr, i, i-1);
            }
            if(i<=n-2 && arr[i] > arr[i+1] ){
                swap(arr, i, i+1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}