package 백준.문제_10828; // 해당 클래스가 속한 패키지명 (문제 분류 목적)

// 필요한 라이브러리 임포트
import java.io.*;               // 입출력을 위한 BufferedReader, IOException 등
import java.util.Stack;        // 자바 내장 스택 클래스 사용

public class Main {

  public static void main(String[] args) throws IOException {
    // 입력을 빠르게 받기 위해 BufferedReader 사용
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 명령의 수 N을 정수로 입력받음
    int n = Integer.parseInt(br.readLine());

    // 정수형 스택 생성
    Stack<Integer> stack = new Stack<>();

    // 출력 결과를 빠르게 모아서 한 번에 출력하기 위한 StringBuilder
    StringBuilder sb = new StringBuilder();

    // N번 반복하여 명령을 하나씩 처리
    for (int i = 0; i < n; i++) {
      String input = br.readLine(); // 한 줄 입력 받기 (ex. "push 3", "pop")

      // "push X" 명령어인 경우
      if (input.startsWith("push")) {
        // 공백으로 split 하여 두 번째 요소를 정수로 변환하여 push
        int x = Integer.parseInt(input.split(" ")[1]);
        stack.push(x);
      }

      // "pop" 명령어 처리
      else if (input.equals("pop")) {
        // 스택이 비었으면 -1, 아니면 pop한 값을 출력 버퍼에 추가
        sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
      }

      // "size" 명령어 처리
      else if (input.equals("size")) {
        // 스택 크기를 출력 버퍼에 추가
        sb.append(stack.size()).append("\n");
      }

      // "empty" 명령어 처리
      else if (input.equals("empty")) {
        // 스택이 비었으면 1, 아니면 0을 출력 버퍼에 추가
        sb.append(stack.isEmpty() ? 1 : 0).append("\n");
      }

      // "top" 명령어 처리
      else if (input.equals("top")) {
        // 스택이 비었으면 -1, 아니면 peek한 값을 출력 버퍼에 추가
        sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
      }
    }

    // 모든 출력 결과를 한 번에 출력 (System.out.println 반복보다 빠름)
    System.out.print(sb);
  }
}
