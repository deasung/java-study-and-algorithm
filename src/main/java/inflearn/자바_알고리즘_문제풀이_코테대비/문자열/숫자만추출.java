package inflearn.자바_알고리즘_문제풀이_코테대비.문자열;

import java.util.Scanner;

/**
 *
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듬
 * 만약 "tge0a1h205er"에서 숫자만 추출하면 0,1,2,0,5이고 이것을 자연수를 만들면 1205이 됨.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * 입력
 * 첫 줄에 숫자가 썩인 문자열이 주어짐.문자열의 길이는 100을 넘지 않음
 *
 * 출력
 * 첫 줄에 자연수를 출력함
 *
 * 예시 입력 1                    예시 출력1
 * g0en2T0s8eSoft               208
 */
public class 숫자만추출 {

  public int soultion(String s) {

//    int answer = 0;
//
//    for(char x: s.toCharArray()) {
//
//      //알파벳
//      if(x >= 48 && x <= 57) answer = answer * 10 + (x-48);
//
//    }
//
//    return answer;

    String answer = "";
    for(char x: s.toCharArray()) {
      if(Character.isDigit(x)) {
        answer += x;
      }
    }

    return Integer.parseInt(answer);

  }

  public static void main(String[] args) {

    숫자만추출 t = new 숫자만추출();

    Scanner kb = new Scanner(System.in);
    String str = kb.next();

    if (str != null) {
      System.out.println(t.soultion(str));
    }


  }


}
