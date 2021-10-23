package lesson5_Prefix_Sums;


//https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
public class PassingCars {
	
	public int solution(int[] A) {
        // write your code in Java SE 8

        int[]prefixSum = new int[A.length+1];
        int count = 0;

        prefixSum[0] = A[0];
        for(int i = 0; i < A.length;i++) {
            prefixSum[i+1] = prefixSum[i]+A[i];
        }

        int total = prefixSum[A.length];

        for(int i = 0; i<A.length; i++) {
            if(A[i] == 0) {
                count += total - prefixSum[i];
                
            }
        }

        if(count > 1000000000 || count < 0) {
            count = -1;
        }
        return count;
    }

}
