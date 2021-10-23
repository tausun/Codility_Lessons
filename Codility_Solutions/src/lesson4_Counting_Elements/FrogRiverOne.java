package lesson4_Counting_Elements;

//https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
public class FrogRiverOne {
	
	public int solution(int X, int[] A) {
        // write your code in Java SE 8

        int k = -1;
        int []counter = new int[X+1];
        counter[0] = 1;


        for(int j = 1; j < counter.length;j++) {
           counter[j] = -1;
        }

        for(int i = 0; i < A.length; i++) {
            if(counter[A[i]] == -1) {
                counter[A[i]] = i;
            }
        }

        for(int j = 1; j < counter.length;j++) {
            if(counter[j] == -1) {
                k = -1;
                break;
            } else if(counter[j] > k) {
                k = counter[j];
            }
        }
        
        return k;
    }

}
