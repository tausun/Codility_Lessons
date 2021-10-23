package lesson6_Sorting;

//https://app.codility.com/programmers/lessons/6-sorting/triangle/

import java.util.*;
public class Triangle {
	
	public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length < 3)
            return 0;

        Arrays.sort(A);
        
        for(int i = 2; i < A.length; i++) {
            if(A[i-2]>=Integer.MAX_VALUE || A[i-1]>=Integer.MAX_VALUE)  {
                Long sum = Long.parseLong(A[i-2]+"") + Long.parseLong(A[i-1]+"");
                if(sum > A[i]) {
                    return 1;
                }
            } else {
                if(A[i-2] + A[i-1] > A[i]) {
                    return 1;
                }
            }
            
        }
        return 0;
    }

}
