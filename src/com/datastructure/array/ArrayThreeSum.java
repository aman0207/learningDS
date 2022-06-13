package com.datastructure.array;

public class ArrayThreeSum {
    public static void main(String[] args) {
        // int[] a = {-1, 2, 1, -4};
        // int sum = 1;
        int[] a = { 2, 1, -9, -7, -8, 2, -8, 2, 3, -8};
        int sum = -1;
        int minDiff = Integer.MAX_VALUE;
        int result = 0;


        p:for(int i = 0; i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    int localSum = a[i]+a[j]+a[k];
                    if(sum == localSum){
                        result = localSum;
                        break p;
                    }else{
                        int localDiff = sum - localSum;
                        
                        if(localDiff <0){
                            if(localDiff > minDiff){
                                result = localSum;
                                minDiff = localDiff;
                            }
                        }else {

                            if(localDiff < minDiff){
                                result = localSum;
                                minDiff = localDiff;
                            }
                        }
                        

                    }
                }
            }
        }
        System.out.println("Result : "+result);
    }
}
