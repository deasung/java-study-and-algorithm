package 백준.사칙연산.문제_2588;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt(); // 첫 번째 수 A 입력
    int B = scanner.nextInt(); // 두 번째 수 B 입력

    int B1 = B % 10;         // B의 1의 자리
    int B10 = (B / 10) % 10; // B의 10의 자리
    int B100 = B / 100;      // B의 100의 자리

    System.out.println(A * B1);   // A * B의 1의 자리
    System.out.println(A * B10);  // A * B의 10의 자리
    System.out.println(A * B100); // A * B의 100의 자리
    System.out.println(A * B);    // A * B의 최종 결과

    scanner.close(); // Scanner 객체 닫기
  }
}