package com.datastructure.stringDS;

public class LongestPalindromeStr {

    int resultStart;
    int resultLength;

    public String longestPalindrome(String s){
        int strLength = s.length();
        if(strLength < 2){
            return s;
        }
        for(int begin = 0; begin < strLength-1; begin++){
            expandRange(s, begin, begin);
            expandRange(s, begin, begin+1);
        }
        return s.substring(resultStart, resultStart+resultLength);
    }

    private void expandRange(String str, int begin, int end){
        while(begin >=0 && end < str.length() &&
        str.charAt(begin)==str.charAt(end)){
            begin --;
            end ++;
        }
        if(resultLength < end-begin-1){
            resultStart = begin + 1;
            resultLength = end-begin-1;
        }
    }
    public static void main(String[] args) {
        LongestPalindromeStr ob = new LongestPalindromeStr();
        String A1 = "aaabaaa";
        String A2 = "aaabaaa";
        String A = "abccba";
        String result = ob.longestPalindrome(A);
        if(result.length() > 0){
            System.out.println("Here is the substr : "+result.toString());
        }else {
            System.out.println("No SubString");
        }
    }
}
