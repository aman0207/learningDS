package com.datastructure.List;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrayList {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	a.addAll(b);
    a.sort((e1,e2)-> Integer.compare(e1, e2));
    }

    public static void main(String[] args) {
        MergeTwoArrayList ob = new MergeTwoArrayList();
        ArrayList<Integer> a = new ArrayList<>(
            Arrays.asList(1,5,8));
        ArrayList<Integer> b = new ArrayList<>(
            Arrays.asList(6,9)
        );

        ob.merge(a, b);
        System.out.println("Result :\n"+a);
    }
}
