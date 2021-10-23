package lesson4_Counting_Elements;

//https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
public class MissingInteger {

	public int solution(int[] A) {
        // write your code in Java SE 8

         int max = 0;
        int result = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }

        int[] counter = new int[max+1];

        for(int i = 0; i < A.length; i++) {
            if(A[i] > 0) {
                counter[A[i]] += 1; 
            }
        }

        for(int i = 1; i < counter.length; i++) {
           if(counter[i] == 0) {
               result = i;
               break;
           }
        }

        if(result == 0) {
            result = max+1;
        }

        return result;
    }
}
