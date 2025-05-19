package 백준.문제_1003;

import java.util.Scanner;

public class Main_GPT {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int[][] dp = new int[41][2];
    dp[0][0] = 1; dp[1][1] = 1;

    for (int i = 2; i <= 40; i++) {
      dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
      dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
    }

    while (T-- > 0) {
      int n = sc.nextInt();
      System.out.println(dp[n][0] + " " + dp[n][1]);
    }
    sc.close();
  }

}
