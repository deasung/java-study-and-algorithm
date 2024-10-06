package 백준.사칙연산.문제_11382;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // 세 개의 정수를 입력받습니다.
    long A = scanner.nextLong();
    long B = scanner.nextLong();
    long C = scanner.nextLong();

    // 세 수의 합을 출력합니다.
    System.out.println(A + B + C);

    scanner.close();


  }

}
