package 백준.사칙연산.문제_18108;

import java.util.Scanner;

/**
 *
 * 입력
 * 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
 *
 * 출력
 * 불기 연도를 서기 연도로 변환한 결과를 출력한다.
 *
 */
public class Main {

  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체 생성

    int n = scanner.nextInt();

    if (n >= 1000 && n <= 3000) {

      int result = n - 543;

      System.out.println(result);
      scanner.close(); // Scanner 객체 닫기

    }


  }

}
