package 백준.문제_10845;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    Queue<Integer> queue = new LinkedList<>();
    StringBuilder sb = new StringBuilder();

    int last = -1; // 가장 마지막에 넣은 값을 저장할 변수

    for (int i = 0; i < n; i++) {
      String input = br.readLine();

      if (input.startsWith("push")) {
        String[] parts = input.split(" ");
        int x = Integer.parseInt(parts[1]);
        queue.add(x);
        last = x; // 마지막으로 추가한 값 갱신
      } else if (input.equals("pop")) {
        sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
      } else if (input.equals("size")) {
        sb.append(queue.size()).append("\n");
      } else if (input.equals("empty")) {
        sb.append(queue.isEmpty() ? 1 : 0).append("\n");
      } else if (input.equals("front")) {
        sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
      } else if (input.equals("back")) {
        sb.append(queue.isEmpty() ? -1 : last).append("\n");
      }
    }

    System.out.print(sb);
  }
}