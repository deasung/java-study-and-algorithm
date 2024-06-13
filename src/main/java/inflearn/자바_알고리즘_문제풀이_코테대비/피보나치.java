package inflearn.자바_알고리즘_문제풀이_코테대비;

import java.util.Scanner;

/**
 * 입력 설명
 * 첫 줄에 총 항수 N(3<=N<=45)
 *
 * 출력설명
 * 첫 줄에 피보나치 수열을 출력함
 *
 * 입력예제 1
 * 10
 *
 * 출력예제 1
 * 1 1 2 3 5 8 13 21 34 55
 */
public class 피보나치 {

//  public int[] solution(int n) {
//    int[] answer = new int[n];
//
//    answer[0] = 1;
//    answer[1] = 1;
//
//    for(int i = 2; i < n; i++) {
//      answer[i] = answer[i-2]+answer[i-1];
//    }
//
//    return answer;
//
//  }

  //손코딩 예시
  public void solution(int n) {

    int a = 1, b = 1, c;

    System.out.println(a+ " " + b + " ");
    for(int i = 2; i < n; i++) {
      c = a+b;
      System.out.println(c + " ");
      a = b;
      b = c;
    }

  }

  public static void main(String[] args) {
    피보나치 T = new 피보나치();
    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();
//    for (int x : T.solution(n)) System.out.print(x+ " ");
  }


}
