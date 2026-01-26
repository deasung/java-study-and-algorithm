package 백준.문제_1655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

  public static void main(String[] args) throws IOException {

    // 빠른 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    // 중간값 이하 → 최대 힙 (역순)
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());

    // 중간값 초과 → 최소 힙 (기본)
    PriorityQueue<Integer> right = new PriorityQueue<>();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(br.readLine());

      // 1단계: 일단 왼쪽 힙에 넣는다
      left.offer(num);

      // 2단계: left의 최대값이 right의 최소값보다 크면 맞바꿈
      if (!right.isEmpty() && left.peek() > right.peek()) {
        right.offer(left.poll());
        left.offer(right.poll());
      }

      // 3단계: left가 더 크거나 같게 유지 (크기 균형 맞추기)
      if (left.size() > right.size() + 1) {
        right.offer(left.poll());
      }

      // 중간값 출력 (왼쪽 루트)
      sb.append(left.peek()).append("\n");
    }

    // 전체 출력
    System.out.print(sb);
  }
}
