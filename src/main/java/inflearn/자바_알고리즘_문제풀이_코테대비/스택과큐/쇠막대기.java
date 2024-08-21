package inflearn.자바_알고리즘_문제풀이_코테대비.스택과큐;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {

    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '(') {
                stack.push('(');
            } else {

                //레이저에 닫는거던 막대기던 자기 짝꿍은 빼버린다
                stack.pop();
                if(str.charAt(i-1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }

            }

        }

        return answer;
    }


    public static void main(String[] args) {

        쇠막대기 t = new 쇠막대기();

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(t.solution(str));

    }
}
