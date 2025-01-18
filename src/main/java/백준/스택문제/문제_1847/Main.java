package 백준.스택문제.문제_1847;

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder output = new StringBuilder();
    Stack<Integer> stack = new Stack<>();

    int n = Integer.parseInt(br.readLine());
    int current = 1;

    for (int i = 0; i < n; i++) {
      int num = Integer.parseInt(br.readLine());

      while (current <= num) { // 목표 숫자까지 push(+)
        stack.push(current++);
        output.append("+\n");
      }

      if (stack.pop() == num) { // 목표 숫자 pop(-)
        output.append("-\n");
      } else {
        System.out.println("NO"); // 불가능한 경우
        return;
      }
    }

    System.out.print(output); // 최종 연산 출력
  }
}
