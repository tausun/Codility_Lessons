package lesson2_Arrays;

//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/

public class Cyclic_Rotations {

	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        int len = A.length;

        if (len == 1 || len == 0) {
            return A;
        }
        int[] B = new int[len];

        for(int i = 0; i < len; i++) {
            int index = i + (K%len);
            if(index > len-1) {
                index -= len;
            }
            B[index] = A[i];
        }
        return B;
    }
}
