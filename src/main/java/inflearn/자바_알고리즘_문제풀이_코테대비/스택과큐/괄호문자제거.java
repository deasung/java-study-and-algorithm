package inflearn.자바_알고리즘_문제풀이_코테대비.스택과큐;


import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호문자제거
 *
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 *
 * ▣ 입력설명
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * ▣ 출력설명
 * 남은 문자만 출력한다.
 *
 * ▣ 입력예제 1
 * (A(BC)D)EF(G(H)(IJ)K)LM(N)
 *
 * ▣ 출력예제 1
 * EFLM
 *
 */

public class 괄호문자제거 {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String s = kb.next();

        Stack<Character> stack = new Stack<>();

        //gpt가 푼거 근데 내가 푼거랑 좀 비슷했지만 난 틀렸다..
        for (char x : s.toCharArray()) {
            if (x == ')') {
                while (!stack.isEmpty() && stack.pop() != '('); //<- 요거 낼 종이에다가 그려보자..꼬옥 20240705
            } else {
                stack.push(x);
            }
        }

        System.out.printf(stack.toString());


    }


}
