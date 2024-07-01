package inflearn.자바_알고리즘_문제풀이_코테대비.투포인터;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * ▣ 입력설명
 * 첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다. 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
 * ▣ 출력설명
 * 첫 줄에 최대 길이를 출력하세요.
 * ▣ 입력예제 1
 * 14 2
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * ▣ 출력예제 1 8
 */
public class 최대길이_연속부분수열 {

  public int solution(int n, int k, int[] arr) {

    int answer = 0, cnt = 0, lt = 0;

    for(int rt = 0; rt < n; rt++) {
      if(arr[rt] == 0) cnt++;
      while (cnt > k) {
        if(arr[lt] == 0) cnt--;
        lt++;
      }
      answer = Math.max(answer, rt-lt+1);
    }

    return answer;

  }


  public static void main(String[] args) {

    최대길이_연속부분수열 T = new 최대길이_연속부분수열();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int k = kb.nextInt();

    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }

    System.out.println(T.solution(n, k, arr));


  }



}
