package 백준.문제_10870;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    if (sc.hasNextInt()) {
      int n = sc.nextInt();

      // n이 0일 때 fibo[1]을 참조하면 에러가 나므로 따로 처리
      if (n == 0) {
        System.out.println(0);
        return;
      }

      int[] fibo = new int[n + 1];
      fibo[0] = 0;
      fibo[1] = 1;

      for (int i = 2; i <= n; i++) {
        fibo[i] = fibo[i - 1] + fibo[i - 2];
      }

      System.out.println(fibo[n]);
    }
  }
}