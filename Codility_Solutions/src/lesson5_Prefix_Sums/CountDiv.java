package lesson5_Prefix_Sums;

//https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/

public class CountDiv {

	public int solution(int A, int B, int K) {
        // write your code in Java SE 8


         if (A % K == 0)
        return (B / K) - (A / K) + 1;

        return (B / K) - (A / K);
    }
	
}
