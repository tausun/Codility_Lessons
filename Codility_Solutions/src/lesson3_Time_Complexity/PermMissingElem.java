package lesson3_Time_Complexity;

import java.util.*;

//https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
public class PermMissingElem {
	public int solution(int[] A) {
        // write your code in Java SE 8

        int len = A.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 1; i <= len+1; i++) {
            map.put(i, 1);
        }

        for(int i = 0; i < len; i++) {
            int e = A[i];
            if(map.containsKey(e)){
                map.remove(e);
            }
        }

        int element = 0;

        for(Integer el: map.keySet()) {
            element = el;
        }

        return element;
    }

}
