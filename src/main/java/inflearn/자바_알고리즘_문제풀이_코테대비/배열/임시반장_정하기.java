package inflearn.자바_알고리즘_문제풀이_코테대비.배열;

import java.util.Scanner;

public class 임시반장_정하기 {

  public int solution(int n, int[][] arr) {

    int maxCount = 0;
    int president = 0;

    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (i != j) {
          for (int k = 0; k < 5; k++) {
            if (arr[i][k] == arr[j][k]) {
              count++;
              break;
            }
          }
        }
      }
      if (count > maxCount) {
        maxCount = count;
        president = i;
      }
    }


    return president + 1;  //0학년은 이상하니 i가 0번째일땐

  }

  public static void main(String[] args) {

    임시반장_정하기 T = new 임시반장_정하기();

    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();

    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n; j++) {

        arr[i][j] = kb.nextInt();

      }

    }

    System.out.println(T.solution(n, arr));

  }

}
