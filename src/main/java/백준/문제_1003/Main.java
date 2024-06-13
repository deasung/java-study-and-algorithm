package 백준.문제_1003;

import java.util.Scanner;

public class Main {

  private static int countZero = 0; // 0이 출력된 횟수
  private static int countOne = 0;  // 1이 출력된 횟수
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    fibonacci(n);

    System.out.println(countZero + " " + countOne);


  }

  public static int fibonacci(int n) {
    if (n == 0) {
      System.out.println("0");
      countZero++;
      return 0;
    } else if (n == 1) {
      System.out.println("1");
      countOne++;
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

}
