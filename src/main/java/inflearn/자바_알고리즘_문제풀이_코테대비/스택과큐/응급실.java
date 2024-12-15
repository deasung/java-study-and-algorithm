package inflearn.자바_알고리즘_문제풀이_코테대비.스택과큐;

import java.util.*;

class Patient {
  int index; // 환자의 순서
  int priority; // 환자의 위험도

  public Patient(int index, int priority) {
    this.index = index;
    this.priority = priority;
  }
}

public class 응급실 {
  public int solution(int n, int m, int[] risks) {
    Queue<Patient> queue = new LinkedList<>();

    // 환자 정보를 큐에 넣기
    for (int i = 0; i < n; i++) {
      queue.offer(new Patient(i, risks[i]));
    }

    int answer = 0; // 몇 번째로 진료받는지 카운트

    while (!queue.isEmpty()) {
      Patient current = queue.poll(); // 맨 앞의 환자
      boolean hasHigherPriority = false;

      // 현재 큐 상태 출력
      System.out.print("현재 큐 상태: ");
      for (Patient p : queue) {
        System.out.print("[" + p.index + "," + p.priority + "] ");
      }
      System.out.println();

      System.out.println("현재 환자: " + current.index + ", 위험도: " + current.priority);

      // 현재 환자보다 높은 위험도를 가진 환자가 있는지 확인
      for (Patient p : queue) {
        if (p.priority > current.priority) {
          hasHigherPriority = true;
          break;
        }
      }

      if (hasHigherPriority) {
        // 더 위험한 환자가 있다면 현재 환자를 뒤로 보냄
        queue.offer(current);
        System.out.println("환자 " + current.index + "는 뒤로 이동\n");
      } else {
        // 위험도가 가장 높다면 진료 받음
        answer++;
        System.out.println("환자 " + current.index + " 진료받음 (현재 순서: " + answer + ")");
        if (current.index == m) {
          System.out.println("목표 환자 " + current.index + "가 진료받음, 순서: " + answer);
          return answer;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    // 입력 받기
    int n = kb.nextInt(); // 환자 수
    int m = kb.nextInt(); // 목표 환자 인덱스

    int[] risks = new int[n]; // 환자의 위험도
    for (int i = 0; i < n; i++) {
      risks[i] = kb.nextInt();
    }

    응급실 T = new 응급실();
    System.out.println("최종 진료 순서: " + T.solution(n, m, risks));
  }
}
