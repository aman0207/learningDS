package com.datastructure.stringDS;

public class StrStr {
    public static void main(String[] args) {
        final String AOLD = "Hello";
        final String BOLD = "ello";
        final String A = "bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba";
        final String B = "babaaa";
        int result = -1;
        StringBuilder sb = new StringBuilder();
        char[] cA = A.toCharArray();
        int lenB = B.length();
        for(int i = 0; i<cA.length; i++){
            char c = cA[i];
            if(B.charAt(0) == c){
                if((i+(lenB-1)) < A.length()){
                    for(int j = i; j<lenB+i; j++){
                        sb.append(cA[j]);
                    }
                    System.out.println("Inside i :"+i+
                    "\tsubStr : "+sb.toString());
                    if(B.equalsIgnoreCase(sb.toString())){
                        result = i;
                        break;
                    }else {
                        sb = new StringBuilder();
                    }
                }
            }
        }
        System.out.println("Result : "+result);
    }
}
