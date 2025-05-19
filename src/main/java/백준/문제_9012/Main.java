package 백준.문제_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다.
 * 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.
 */
public class Main {

  public static void main(String[] args) throws IOException {

    // 입력을 빠르게 받기 위해 BufferedReader 사용
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 명령의 수 N을 정수로 입력받음
    int t = Integer.parseInt(br.readLine());

    // 각 테스트 케이스에 대해 처리
    for (int i = 0; i < t; i++) {
      String input = br.readLine();

      // 스택을 사용하여 괄호 문자열의 유효성 검사
      if (isValidParentheses(input)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }



  }

  private static boolean isValidParentheses(String input) {
    int balance = 0; // 괄호의 균형을 나타내는 변수

    for (char c : input.toCharArray()) {
      if (c == '(') {
        balance++; // 여는 괄호일 경우 균형 증가
      } else if (c == ')') {
        balance--; // 닫는 괄호일 경우 균형 감소
      }

      // 균형이 음수가 되면 잘못된 괄호 문자열
      if (balance < 0) {
        return false;
      }
    }

    // 모든 괄호가 짝을 이루면 true, 아니면 false
    return balance == 0;
  }

}
