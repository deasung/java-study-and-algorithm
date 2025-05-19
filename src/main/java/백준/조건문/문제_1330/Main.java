package 백준.조건문.문제_1330;


import java.util.Scanner;

/**
 * 입력 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 * <p>
 * 출력 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 * <p>
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.
 * 제한 -10,000 ≤ A, B ≤ 10,000
 */
public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체 생성

    int a = scanner.nextInt();

    int b = scanner.nextInt();

    if ((a >= -10000 && b >= -10000) && (a <= 10000 && b <= 10000)) {

      if (a > b) {
        System.out.println(">");
      } else if (a < b) {
        System.out.println("<");
      } else  if (a == b) {
        System.out.println("==");
      }

    }

  }

}
