package inflearn.자바_알고리즘_문제풀이_코테대비.배열;

import java.util.Scanner;

//https://www.inflearn.com/course/lecture?courseSlug=%EC%9E%90%EB%B0%94-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%ED%85%8C%EB%8C%80%EB%B9%84&unitId=72729&category=questionDetail&tab=community
//다시 강의한번 봐야할듯 6/23
public class 멘토링 {

  public int solution(int n, int m, int[][] arr) {

    int answer = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        int cnt = 0;
        for (int k = 0; k < m; k++) {
          int pi = 0, pj = 0;
          for (int s = 0; s < n; s++) {
            if (arr[k][s] == i) {
              pi = s;
            }
            if (arr[k][s] == j) {
              pj = s;
            }
          }
          if (pi < pj) {
            cnt++;
          }
        }
        if (cnt == m) {
          answer++;
          //System.out.println(i+" "+j);
        }
      }
    }
    return answer;
  }



  public static void main(String[] args) {

    멘토링 T = new 멘토링();

    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();

    int k = kb.nextInt();

    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n; j++) {

        arr[i][j] = kb.nextInt();

      }

    }
  }
}
