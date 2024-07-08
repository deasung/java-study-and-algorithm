package inflearn.자바_알고리즘_문제풀이_코테대비.스택과큐;

import java.util.Scanner;
import java.util.Stack;


/**
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 * ▣ 입력설명
 * 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다. 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
 * ▣ 출력설명
 * 연산한 결과를 출력합니다.
 * ▣ 입력예제 1
 * 352+*9-
 * ▣ 출력예제 1
 * 12
 */

public class 후위식연산 {

    public int solution(String str) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x: str.toCharArray()) {

            // '0' -> 48 , '1' -> 49
            // '2' -> 50,

            if(Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }

        }

        answer = stack.get(0);

        return answer;

    }

    public static void main(String[] args) {

        후위식연산 t = new 후위식연산();

        Scanner kb = new Scanner(System.in); // 스캐너 객체 생성
        String postfix = kb.next(); // 사용자로부터 후위 연산식을 입력받음
        kb.close(); // 스캐너 객체 닫음

        System.out.println(t.solution(postfix));

//        System.out.println(evaluatePostfix(postfix)); // 후위 연산식을 평가한 결과를 출력
    }

    //gpt가 푼것
//    public static int evaluatePostfix(String postfix) {
//        Stack<Integer> stack = new Stack<>(); // 연산을 위한 스택 생성
//
//        for (char ch : postfix.toCharArray()) { // 후위 연산식의 각 문자를 순회
//            if (Character.isDigit(ch)) { // 현재 문자가 숫자인 경우
//                stack.push(ch - '0'); // 문자를 숫자로 변환하여 스택에 푸시
//            } else { // 현재 문자가 연산자인 경우
//                int b = stack.pop(); // 스택에서 두 번째 피연산자를 팝
//                int a = stack.pop(); // 스택에서 첫 번째 피연산자를 팝
//                int result = 0; // 연산 결과를 저장할 변수
//
//                switch (ch) { // 연산자에 따라 연산 수행
//                    case '+':
//                        result = a + b; // 덧셈 연산
//                        break;
//                    case '-':
//                        result = a - b; // 뺄셈 연산
//                        break;
//                    case '*':
//                        result = a * b; // 곱셈 연산
//                        break;
//                    case '/':
//                        result = a / b; // 나눗셈 연산
//                        break;
//                }
//
//                stack.push(result); // 연산 결과를 스택에 푸시
//            }
//        }
//
//        return stack.pop(); // 최종 결과를 반환
//    }
}
