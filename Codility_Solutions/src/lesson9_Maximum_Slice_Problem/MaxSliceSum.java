package lesson9_Maximum_Slice_Problem;

//https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/

public class MaxSliceSum {

	public int solution(int[] A) {
		int maxEnding = 0;
		int maxSlice = A[0];
		for (int value : A) {
			maxEnding = Math.max(value, maxEnding + value);
			maxSlice = Math.max(maxSlice, maxEnding);
		}
		return maxSlice;
	}
	
}
