package inflearn.자바_알고리즘_문제풀이_코테대비.문자열;

import java.util.Scanner;

/**
 * 문자열 압축
 *
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로
 * 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략함
 *
 * 입력설명
 * 첫 줄에 문자열이 주어짐.문자열의 길이는 100을 넘지 않음
 *
 * 출력설명
 * 첫 줄에 압축된 문자열을 출력함
 *
 * 입력예제 1
 * KKHSSSSSSSE
 *
 * 출력예제 1
 * K2HS7E
 *
 *
 */
public class 문자열_압축 {

//  GPT
//  public static void main(String[] args) {
//    String input = "KKHSSSSSSSE";
//    String result = removeDuplicates(input);
//    System.out.println(result);
//  }
//
//  public static String removeDuplicates(String str) {
//    StringBuilder result = new StringBuilder();
//    char previousChar = 0;
//
//    for (char currentChar : str.toCharArray()) {
//      if (currentChar != previousChar) {
//        result.append(currentChar);
//        previousChar = currentChar;
//      }
//    }
//
//    return result.toString();
//  }

  public String solution(String s) {

    String answer = "";
    s = s + " ";
    int cnt = 1;
    for(int i = 0; i < s.length()-1; i++) {
      if (s.charAt(i) == s.charAt(i+1)) {
        cnt++;
      } else {
        answer += s.charAt(i);
        if (cnt > 1) {
          answer += String.valueOf(cnt);
          cnt = 1;
        }
      }
    }

    return answer;

  }


  public static void main(String[] args) {

    문자열_압축 T = new 문자열_압축();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.solution(str));

  }


}
