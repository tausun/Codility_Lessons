package lesson1_Iterations;

//https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
public class Binary_Gap {

    public int solution(int N) {
        // write your code in Java SE 8
        String binaryRep = Integer.toBinaryString(N);
        //System.out.println("binary : " + binaryRep);
        boolean foundStart = false;
        int maxLen = 0;
        int len = 0;

        for(int i = 0; i < binaryRep.length(); i++) {
            char c = binaryRep.charAt(i);
           // System.out.println("char at : " + i + " : " + c);
            if(c == '0') {
                if(!foundStart) {
                    foundStart = true;
                }
                len++;
            } else {
                if(foundStart) {
                    if(len > maxLen) {
                        maxLen = len;
                    }
                    foundStart = false;
                    len = 0;
                }
            }
        }
        return maxLen;
    }
}
