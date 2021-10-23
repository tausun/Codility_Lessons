package lesson3_Time_Complexity;

//https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
public class FrogJmp {
	
	public int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        int diff = Y - X;
        int jump = (diff/D) + (diff%D==0?0:1);

        return jump;
    }

}
