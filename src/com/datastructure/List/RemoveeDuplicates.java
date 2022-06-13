package com.datastructure.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveeDuplicates {
    public int removeDuplicates(ArrayList<Integer> a) {
	
    Set<Integer> result = new HashSet<>();
    result.addAll(a);
    a.clear();
    a.addAll(result);
    a.sort((e1,e2)-> Integer.compare(e1, e2));
    return result.size();
    }

    public static void main(String[] args) {
        RemoveeDuplicates ob = new RemoveeDuplicates();
        ArrayList<Integer> input = new ArrayList<>(
            List.of(1,2,2,3,3));

        System.out.println("Result : "+ob.removeDuplicates(input));
        System.out.println("Result arraylist :\n"+input);
    }
}
