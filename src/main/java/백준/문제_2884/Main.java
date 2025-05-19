package 백준.문제_2884;

//https://www.acmicpc.net/problem/2884

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력받은 시(hour)와 분(minute)
    int hour = sc.nextInt();
    int minute = sc.nextInt();

    // 45분을 앞당김
    minute -= 45;

    // 분이 음수가 될 경우 처리
    if (minute < 0) {
      minute += 60;  // 분을 양수로 만듦
      hour--;        // 한 시간을 줄임
      if (hour < 0) {  // 시간이 음수(0시에서 1시간 전이면 23시로 변경)
        hour = 23;
      }
    }

    // 결과 출력
    System.out.println(hour + " " + minute);

    sc.close();
  }
}
