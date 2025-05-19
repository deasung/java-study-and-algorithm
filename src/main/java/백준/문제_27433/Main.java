package 백준.문제_27433;

import java.util.Scanner;

public class Main {

  //n!=n×(n−1)×(n−2)...×1

  public static int factorial(int n) {

    if (n == 1) {
      return 1;
    }

    return n * factorial(n - 1);

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    System.out.println(N + "! = " + factorial(N)); // 결과 출력


    scanner.close();


  }

}
