package 백준.문제_2480;

import java.util.Scanner;

public class Main {


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    int b = sc.nextInt();

    int c = sc.nextInt();

    int result = 0;

    if (a == b && b == c) {

      result += 10000 + (a) * 1000;

    } else if (a == b || a == c || b == c) { // 2. 두 눈만 같은 경우 (세 눈이 모두 같은 경우는 위에서 걸러졌으므로)
      // 이제 정확히 두 눈만 같은 경우입니다.
      // 어떤 숫자가 두 번 나왔는지 찾아야 합니다.
      int sameNumber;
      if (a == b) { // a와 b가 같고, c는 다름 (위에서 모두 같은 경우를 걸렀으므로)
        sameNumber = a;
      } else if (a == c) { // a와 c가 같고, b는 다름
        sameNumber = a;
      } else { // b와 c가 같고, a는 다름
        sameNumber = b;
      }
      result = 1000 + sameNumber * 100; // 요청하신 상금 계산
    } else {
      result = Math.max(Math.max(a, b), c) * 100;
    }

    System.out.println(result);

  }

}
