package lesson6_Sorting;

import java.util.*;
//https://app.codility.com/programmers/lessons/6-sorting/distinct/
public class Distinct {
	public int solution(int[] A) {
        // write your code in Java SE 8

        int count = 0;
        Arrays.sort(A);

        for(int i = 0; i < A.length; i++) {
            if( i >= 1) {
                if(A[i] != A[i-1]) {
                    count++;
                }
              
            } else {
                count ++;
            }
        }
        return count;
    }
}
