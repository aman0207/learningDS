package com.datastructure.stringDS;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>(Arrays.asList(
            "abab", "ab", "abcd"
        ));
        //"abcdefgh", "aefghijk", "abcefgh"
        A.sort((a,b)-> Integer.compare(a.length(), b.length()));
        System.out.println("Sorted by len :"+A);
        String small = A.get(0);
        boolean found = false;
        
        for(int i =1; i<A.size();i++){
            String s = A.get(i);
            while(small.length()>0){

                s = s.substring(0, small.length());
                if(s.equals(small)){
                    found = true;
                    break;
                }else{
                    small = small.substring(0, small.length()-1);
                }
            }
        }
        if(found){
            System.out.println("Small : "+small);
        }else {
            System.out.println("No Small");
        }
        ArrayList<String> B = new ArrayList<>(Arrays.asList(
            "abcdefgh", "aefghijk", "abcefgh"
        ));
        // "abab", "ab", "abcd"
        solve(B);

    }

    public static void solve(ArrayList<String> A){
        A.sort((x,y)-> x.compareTo(y));
        String first = A.get(0);
        String last = A.get(A.size()-1);
        int c = 0;
        while(c<first.length() &&
        first.charAt(c) == last.charAt(c)){
            c++;
        }
        
        System.out.println("Prefix : "+first.substring(0, c));
        
    }
}
