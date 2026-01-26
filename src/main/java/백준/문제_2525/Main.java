package 백준.문제_2525;

import java.util.Scanner;

public class Main { // 클래스 명은 반드시 Main
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1. 입력 받기
    if (sc.hasNextInt()) {
      int H = sc.nextInt();
      int M = sc.nextInt();
      int T = sc.nextInt();

      // 2. 모든 시간을 '분'으로 통합
      int totalMinute = (H * 60) + M + T;

      // 3. 다시 '시'와 '분'으로 분리
      // 60으로 나눈 몫을 24로 나눈 나머지가 최종 '시'
      int finalH = (totalMinute / 60) % 24;
      int finalM = totalMinute % 60;

      // 4. 결과 출력
      System.out.println(finalH + " " + finalM);
    }

    sc.close();
  }
}