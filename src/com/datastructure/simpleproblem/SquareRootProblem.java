package com.datastructure.simpleproblem;

public class SquareRootProblem {


    public int mySqrt(int x) {
        
        // if(x == 1){
        //     return 1;
        // }
        // for(int i=2; i <= x/2; i++){
        //     if(x% (i*i) == 0){
        //         return i;
        //     }

        // }

        Double sqrt = Math.sqrt(x);
        return sqrt.intValue();
    }

    public static void main(String[] args) {
        SquareRootProblem ob = new SquareRootProblem();
        int x = 8;
        System.out.println("X = "+x+"\tSqrt = "+ob.mySqrt(x));
    }
}
