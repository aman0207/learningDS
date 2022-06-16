package com.datastructure.stringDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelConsonentsSubString {
    public static void main(String[] args) {
        String A = "aba";
        List<String> arr = new ArrayList<>();
        List<Character> vowels = Arrays.asList(
            'a','e','i','o','u');

        // first get all substrings

        for(int i = 0; i< A.length(); i++){
            for(int j = i+1; j<= A.length(); j++){
                String str = A.substring(i, j);
                if(str.length() >1){
                    if(vowels.contains(
                        str.charAt(0)) && 
                        !vowels.contains(
                            str.charAt(str.length()-1))
                            || (
                                !vowels.contains(
                        str.charAt(0)) && 
                        vowels.contains(
                            str.charAt(str.length()-1))
                            )) {
                                arr.add(str);
                        }
                }
                
            }
        }

        System.out.println("Arr : "+arr);
        int result = solve(A);
        System.out.println("Result2 : "+result);
    }

    public static int solve(String A) {
        int len = A.length();
        if(len <2){
            return 0;
        }
        int c = 0;
        int v = 0;
        for(int i = 0; i<len;i++){
            char a = A.charAt(i);
            if(
                a == 'a' || a == 'e' || a == 'i' || a=='o' || a=='u'
            ){
                v++;
            }else{
                c++;
            }
        }
        
        int result = c*v % 1000000007;
        return result;
    }
}
