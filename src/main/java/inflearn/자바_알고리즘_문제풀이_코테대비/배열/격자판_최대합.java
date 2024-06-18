package inflearn.자바_알고리즘_문제풀이_코테대비.배열;


import java.util.Scanner;

/**
 * 격자판 최대합

 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합 니다.
 * ▣ 입력설명
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는 다.
 * ▣ 출력설명
 * 최대합을 출력합니다.
 */
public class 격자판_최대합 {

  //강사가 푼것
  public int solution(int n, int[][] arr) {

    int answer = Integer.MIN_VALUE;

    int sum1, sum2;

    for(int i = 0; i < n; i++) {
      sum1 = sum2 = 0;
      for(int j = 0; j < n; j++) {
        sum1+=arr[i][j];
        sum2+=arr[j][i];
      }
      answer=Math.max(answer, sum1);
      answer=Math.max(answer, sum2);
    }

    sum1=sum2=0;

    for(int i = 0; i < n; i++) {
      sum1+=arr[i][i];
      sum2+=arr[i][n-i-1];
    }

    answer=Math.max(answer, sum1);
    answer=Math.max(answer, sum2);


    return answer;

  }


  //내가 푼것
//  public int solution(int n, int[][] arr) {
//
//    int max = 0;
//
//
//    for(int i = 0; i < n; i++) {
//
//      int row = 0;
//      int col = 0;
//      int diagonal = 0;
//
//      //행
//      for(int j = 0; j < n; j++) {
//
//        row += arr[i][j];
//        col += arr[j][i];
//        diagonal += arr[j][j];
//
//      }
//
//      max = Math.max(max,row);
//      max = Math.max(max,col);
//      max = Math.max(max,diagonal);
//
//    }
//
//
//    return max;
//  }

  public static void main(String[] args) {

    격자판_최대합 T = new 격자판_최대합();

    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();

    int[][] arr = new int[n][n];

    for(int i = 0; i < n; i++) {

      for(int j = 0; j < n; j++) {

        arr[i][j] = kb.nextInt();

      }

    }

    System.out.println(T.solution(n,arr));


  }

}
