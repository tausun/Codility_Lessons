package lesson6_Sorting;

import java.util.*;

//https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
public class MaxProductOfThree {
	public int solution(int[] A) {
        // write your code in Java SE 8

        int product1 = 1;
        int product2 = 1;
        Arrays.sort(A);
        
        for(int i = 0; i < A.length; i++) {
            if(i < 2) {
                product2 *= A[i];
            }
            if(i >= A.length-3) {
                product1 *= A[i];
            }
            if(A.length > 2 && i == A.length-1) {
                product2 *= A[i];
            }
        }

        return Math.max(product1, product2);
    }
}
