package com.datastructure.array;

import java.util.Arrays;


public class ArrayGreaterThanSmallest {

    public char nextGreatestLetter(char[] letters, char target) {
        
        if('z' == target){
            return letters[0];
        }

        int index = Arrays.binarySearch(letters, target);
        if(index == (letters.length -1)){
            return letters[0];
        }
        return index < 0 ? 
        letters[(index *-1) -1]:
        letters[index+1];

    }

    public static void main(String[] args) {
        ArrayGreaterThanSmallest ob = new ArrayGreaterThanSmallest();
        char arr[] = {'c','f','j'};
        char target = 'k';


        System.out.println("Result : "
            +ob.tryTwo(arr, target));    
    }

    public Character tryTwo(char[] letters, char target) {
        for(Character ch : letters) {
            if(ch>target)
                return ch;
        }
        return letters[0];        
    }
    
}
