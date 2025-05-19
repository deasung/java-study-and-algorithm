package 백준.문제_10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) throws IOException {

    // 빠른 입력을 위한 BufferedReader 설정
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 명령 개수 입력 받기
    int n = Integer.parseInt(br.readLine());

    // 정수를 저장할 덱(Deque) 선언
    Deque<Integer> deque = new LinkedList<>();

    // 출력 결과를 저장할 StringBuilder
    StringBuilder sb = new StringBuilder();

    // n번 명령 처리
    for (int i = 0; i < n; i++) {

      String input = br.readLine(); // 한 줄 입력 받기

      if (input.startsWith("push_front")) {
        // "push_front X" 명령 처리
        int x = Integer.parseInt(input.split(" ")[1]);
        deque.addFirst(x);

      } else if (input.startsWith("push_back")) {
        // "push_back X" 명령 처리
        int x = Integer.parseInt(input.split(" ")[1]);
        deque.addLast(x);

      } else if (input.equals("pop_front")) {
        // 앞에서 꺼내기 (없으면 -1)
        sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");

      } else if (input.equals("pop_back")) {
        // 뒤에서 꺼내기 (없으면 -1)
        sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");

      } else if (input.equals("size")) {
        // 현재 덱 크기 출력
        sb.append(deque.size()).append("\n");

      } else if (input.equals("empty")) {
        // 비었는지 여부 출력 (비었으면 1)
        sb.append(deque.isEmpty() ? 1 : 0).append("\n");

      } else if (input.equals("front")) {
        // 앞쪽 값 보기 (없으면 -1)
        sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");

      } else if (input.equals("back")) {
        // 뒤쪽 값 보기 (없으면 -1)
        sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
      }
    }

    // 모든 결과 한 번에 출력
    System.out.print(sb);
  }
}
