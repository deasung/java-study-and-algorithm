package inflearn.자바_알고리즘_문제풀이_코테대비.문자열;


import java.util.Scanner;

/**
 * 7.회문 문자열
 * 설명
 * - 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 함
 * - 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성해라
 * - 단 회문을 검사할때 대소문자를 구분하지 않음
 *
 * 입력
 * - 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어짐
 *
 * 출력
 * - 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력함
 *
 * 예시
 * gooG     YES
 *
 */

public class 회문_문자열 {


  public String soultion(String input) {

//    String result = "YES";
//
//    input = input.toUpperCase();
//
//    int len = input.length();
//
//    for (int i = 0; i < len/2; i++) {
//
//      if (input.charAt(i) != input.charAt(len-i-1))
//        return  "NO";
//    }
//
//    return result;

    String result = "NO";
    String tmp = new StringBuilder(input).reverse().toString();

    if (input.equalsIgnoreCase(tmp)) result = "YES";

    return result;

  }

  public static void main(String[] args) {

    회문_문자열 t = new 회문_문자열();

    Scanner kb = new Scanner(System.in);
    String n = kb.next();

    if (n != null) {
      System.out.println(t.soultion(n));
    }


  }
}
