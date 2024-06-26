package inflearn.자바_알고리즘_문제풀이_코테대비;

import java.util.Scanner;

/**
 * 소수(에라토스테네스 체)
 *
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성해라
 * 만약 20이 입력되면 1부터 20까지의 소수는 2,3,5,7,11,13,17,19로 총 8개
 * 제한시간은 1초
 *
 * 입력설명
 * - 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어짐
 *
 * 출력설명
 * - 첫 줄에 소수의 개수를 출력
 *
 * 입력예제 1
 * 20
 *
 * 출력예제 1
 * 8
 */
public class 소수_에라토스테네스_체 {


  public int solution(int n) {
    int answer = 0;
    int[] ch = new int[n+1];
    for(int i = 2; i <= n; i++) {
      if(ch[i] == 0) {
        answer++;
        for(int j = i; j <= n; j = j+i) {
          ch[j] = 1;
          System.out.print(ch[j] + " "); // 루프 돌 때마다 ch 배열 값 출력
        }

        System.out.println(); // 다음 i로 넘어가기 전에 줄바꿈



      }
    }

    return answer;
  }


  public static void main(String[] args) {

    소수_에라토스테네스_체 T = new 소수_에라토스테네스_체();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    System.out.println(T.solution(n));


  }


}
