package com.datastructure.stringDS;

public class IntegerToRoman {
    public static void main(String[] args) {
        int input = 59;
        int a = input;
        Integer[] nums = {1000, 900, 500, 400, 100,90,50,40,10,9,5,4,1};
        String[] romanSymbols  ={"M","CM","D", "CD","C", "XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result = new StringBuilder();
        for(int i =0; i< nums.length; i++){
            while(a >= nums[i]){
                a -= nums[i];
                result.append(romanSymbols[i]);
            }

        }

        System.out.println("Input : "+input+
        "\nOutput : "+result.toString());
    }
}
