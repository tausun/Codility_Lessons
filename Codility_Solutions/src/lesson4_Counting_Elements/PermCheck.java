package lesson4_Counting_Elements;

//https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
//Task Score 83%, Correctness 83%, Performance 83%
public class PermCheck {
	
	public int solution(int[] A) {
        // write your code in Java SE 8

         int res = 1;
        int max = 0;
        for(int i = 0 ; i < A.length; i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }

        int []counter = new int[max+1];

        for(int i = 0 ; i < A.length; i++) {
            counter[A[i]] += 1;
        }

        for(int i = 1 ; i < counter.length; i++) {
            if(counter[i] != 1) {
                res = 0;
                return res;
            }
        }

        return res;
    }

}
