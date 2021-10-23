package lesson3_Time_Complexity;

//https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/

public class TapeEquilibrium {

	public int solution(int[] A) {
        // write your code in Java SE 8

        int sumR = 0;
        int sumL = 0;

        int minDiff = 100000;

        for(int i = 0; i < A.length; i++) {
            sumR += A[i];
        }

        for(int i = 0; i < A.length - 1; i++) {
            sumR -= A[i];
            sumL += A[i];
            int diff = Math.abs(sumL - sumR);
            if(diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
