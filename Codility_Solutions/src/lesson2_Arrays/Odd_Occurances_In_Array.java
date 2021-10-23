package lesson2_Arrays;

import java.util.*;

//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/

public class Odd_Occurances_In_Array {
	public int solution(int[] A) {
        // write your code in Java SE 8

        int e = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < A.length; i++) {
            int el = A[i];
            if(map.containsKey(el)){
                map.remove(el);
            } else {
                map.put(el, 1);
            }
        }

        for (Integer element: map.keySet()) {
            e = element;
        } 
        return e;
    }

}
