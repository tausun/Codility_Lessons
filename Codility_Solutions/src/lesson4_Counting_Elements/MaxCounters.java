package lesson4_Counting_Elements;


//https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
//Task Score 77%, Correctness 100%, Performance 60%
public class MaxCounters {
	
	public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        int[]B = new int[N];
        int max = 0;

        for(int i = 0; i < A.length; i++) {
            int operation = A[i];
            if(operation >= 1 && operation <= N) {
                int index = operation - 1;
                B[index] += 1;
                if(B[index] > max){
                    max = B[index];
                }
            } else if (operation == N+1) {
                for(int j = 0; j < B.length; j++) {
                    B[j] = max;
                }
            }
        }

        return B;
    }

}
