package 백준.문제_1004;

import java.util.Scanner;

public class Main_GPT {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스의 수

    while (T-- > 0) {
      int x1 = sc.nextInt(), y1 = sc.nextInt(); // A의 좌표
      int x2 = sc.nextInt(), y2 = sc.nextInt(); // B의 좌표
      int n = sc.nextInt(), count = 0; // 원의 수와 경계 통과 횟수

      while (n-- > 0) {
        int cx = sc.nextInt(), cy = sc.nextInt(), r = sc.nextInt();
        int distA = (x1 - cx) * (x1 - cx) + (y1 - cy) * (y1 - cy);
        int distB = (x2 - cx) * (x2 - cx) + (y2 - cy) * (y2 - cy);
        int radiusSquared = r * r;

        // 경계를 통과하면 count 증가
        if ((distA < radiusSquared) != (distB < radiusSquared)) count++;
      }

      System.out.println(count); // 결과 출력
    }
    sc.close();
  }

}
