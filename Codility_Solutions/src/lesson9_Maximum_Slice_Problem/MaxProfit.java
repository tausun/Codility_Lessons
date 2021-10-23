package lesson9_Maximum_Slice_Problem;

//https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
public class MaxProfit {
	
	public int solution(int[] A) {
        // write your code in Java SE 8
        int maxProfit = 0;
        int minPrice = A.length > 0 ? A[0] : 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] < minPrice) {
                minPrice = A[i];
            }
            maxProfit = Math.max(maxProfit, A[i] - minPrice);
        }
        return maxProfit;
    }

}
