package 백준.스택문제.문제_10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Stack {
  private List<Integer> stack; //리스트 기반 스택

  public Stack() {
    this.stack = new ArrayList<>(); //스택초기화
  }

  // push: 요소 추가
  public void push(int x) {
    stack.add(x);
  }

  // pop: 스택의 top 제거 후 반환(비어 있으면 -1)
  public int pop() {
    if (stack.isEmpty()) {
      return -1;
    }
    return stack.remove(stack.size() - 1);
  }

  // top: 스택의 최상단 값 확인(비어 있으면 -1)
  public int top() {
    if (stack.isEmpty()) return -1;
    return stack.get(stack.size() - 1);
  }

  // size: 스택 크기 반환
  public int size() {
    return stack.size();
  }

  // empty: 스택이 비어있는지 확인(비어있으면 1, 아니면 0)
  public int empty() {
    return stack.isEmpty() ? 0 : stack.get(stack.size() - 1);
  }

}



public class Main {

  public static void main(String[] args) throws IOException {


    //BufferedReader를 사용하는 이유
    /*
       BufferedReader는 Java에서 입력을 빠르게 처리할 수 있도록 도와주는 클래스
       일반적으로 Scanner보다 더 빠른 입력 속도를 제공하며, 많은 양의 데이터를 읽을 때 유용

       BufferedReader를 사용하는 이유
       - Scanner보다 빠름 (입력을 버퍼에 저장하여 처리)
       - 한 줄 단위로 읽기 가능 (readLine())
       - 파일 입력도 효율적으로 처리 가능
       - split()과 함께 사용하면 공백 기준으로 데이터 분할 가능
     */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder output = new StringBuilder();

    int N = Integer.parseInt(br.readLine().trim());  // 첫 번째 줄: 명령어 개수

    Stack stack = new Stack();

    for(int i = 0; i < N; i++) {

      String[] commands = br.readLine().trim().split(" ");

      switch (commands[0]) {
        case "push":
          stack.push(Integer.parseInt(commands[1])); //push X (X를 정수로 변환)
          break;

        case "pop":
          output.append(stack.pop()).append("\n"); //pop
          break;

        case "size":
          output.append(stack.size()).append("\n"); //size
          break;

        case "empty":
          output.append(stack.empty()).append("\n"); //empty
          break;

        case "top":
          output.append(stack.top()).append("\n"); //top(peek)
          break;

      }

    }

    // 결과 한번에 출력(속도 최적화)
    System.out.print(output);

  }

}
