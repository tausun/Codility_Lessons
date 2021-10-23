package lesson7_Stacks_And_Queues;

//https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
//87%
import java.util.*;

public class Brackets {
	
	public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stk = new Stack<Character>();  

        for(int i = 0; i <S.length(); i++) {
            Character c = S.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else {
                if(c == ')' && stk.size()>0 && stk.peek() == '(') {
                    stk.pop();
                } else if(c == '}' && stk.size()>0 && stk.peek() == '{') {
                    stk.pop();
                } else if(c == ']' && stk.size()>0 && stk.peek() == '[') {
                    stk.pop();
                }
            }
        }


        if(stk.size() == 0){
            return 1;
        }
        return 0;
    }
}
