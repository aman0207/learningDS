package com.datastructure.stringDS;

public class StrStr {
    public static void main(String[] args) {
        final String AOLD = "Hello";
        final String BOLD = "ello";
        final String A = "bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba";
        final String B = "babaaa";
        useInbuildStringfun(A, B);
        int result2= solve(A,B);
        System.out.println("Result2 : "+result2);
    }

    private static void useInbuildStringfun(final String A, final String B) {
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

    private static int solve(final String A, final String B){
        int lenA = A.length();
        int lenB = B.length();
        int i =0 ;
        int j = 0;
        int result = -1;
        for(i = 0; i< lenA; i++){
            if(A.charAt(i) == B.charAt(0)){
                int index = i+1;
                result = i;
                for(j = 1; j< lenB && index < lenA; j++){
                    if(A.charAt(index) != B.charAt(j)){
                        result = -1;
                        break;
                    }
                    index++;
                }
                System.out.println("inside another loop i : "+i+
                "\tresult : "+result);
                if(result > -1){
                    return result;
                }
            }
        }
        return result;
    }
}
