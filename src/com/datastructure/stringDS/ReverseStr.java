package com.datastructure.stringDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ReverseStr {
    public static void main(String[] args) {
        String input = "the sky is blue";
        StringBuilder sb  = new StringBuilder(input);
        sb.reverse();
        System.out.println("Result : "+sb.toString());
        ArrayList<String> arr = new ArrayList<>();
        String[] ss = input.split(" ");
        arr.addAll(Arrays.asList(ss));
        StringBuilder sb2 = new StringBuilder();
        arr.forEach(s -> {
            StringBuilder sb3 = new StringBuilder(s);
            sb2.append(sb3.reverse().toString());
            sb2.append(" ");
        }); 
        System.out.println("Result2 : "+sb2.toString());
        Collections.reverse(arr);
        StringBuilder sb4= new StringBuilder();
        arr.forEach(s ->{
            sb4.append(s+" ");
        });
        System.out.println("Result3 : "+arr.toString());
        System.out.println("Result4 : "+sb4.toString());
        String input2 = "qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo";

        String result5 = stackApproach(input2);
        String result6 = solve(input2);
        System.out.println("Result6 : "+result6);
        System.out.println("Compare : "+
        result5.equalsIgnoreCase(result6));
    }

    public static String stackApproach(String A) {
        Stack<String> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(char c : A.trim().toCharArray()){  
            if(c == ' '){
                // if(!sb.isEmpty()){
                if(sb.length() != 0){
                    s.push(sb.toString());
                    sb = new StringBuilder();
                }
                if(s.peek() != " ")
                    s.push(" ");
            }
            else {
                sb.append(c);
            }
        }
        if(!sb.isEmpty()){
            s.push(sb.toString());
        }
        while(!s.isEmpty()){
            sb2.append(s.pop());
        }
        System.out.println("Result5 : "+sb2.toString());
        return sb2.toString();
    }

    public static String solve(String A) {

        Stack<String> st = new Stack<>();

        String res = "";

        int j=0;

        while(j<A.length()){

            if(A.charAt(j) == ' '){

                j++;

            }

            else

                break;

        }   

        for(int i=j;i<A.length();i++){

            if(A.charAt(i)!= ' '){

                res = res+A.charAt(i);

            }else{

                if(res != "")

                    st.push(res);

                res="";

            }

        }

        if(res != "")

            st.push(res);

        res="";

        res = res + st.pop();

        while(!st.isEmpty()){

            res = res+ " " + st.pop();

        }

        return res;

    }



}
