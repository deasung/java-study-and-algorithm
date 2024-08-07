package inflearn.자바_알고리즘_문제풀이_코테대비.스택과큐;


import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

/**
 * 올바른 괄호
 *
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 *
 * ▣ 입력설명
 * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 *
 * ▣ 출력설명
 * 첫 번째 줄에 YES, NO를 출력한다.
 *
 * ▣ 입력예제 1
 * (()(()))(()
 *
 * ▣ 출력예제 1
 * NO
 */
public class 올바른괄호 {

  public String solution(String str) {

    String answer = "YES";
    Stack<Character> stack = new Stack<>();
    for(char x : str.toCharArray()) {
      if(x == '(') stack.push(x);
      else {
        if(stack.isEmpty()) return "NO";
        stack.pop();

      }
    }

    if(!stack.isEmpty()) return "NO";
    return answer;

  }



  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    String s = kb.next();

    char[] temp = s.toCharArray();

    HashMap<Character, Integer> result = new HashMap<>();

    for (int i = 0; i < temp.length; i++) {

      result.put(temp[i], result.getOrDefault(temp[i], 0) + 1);

    }

    if (Objects.equals(result.get('('), result.get(')'))) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }



  }

}
