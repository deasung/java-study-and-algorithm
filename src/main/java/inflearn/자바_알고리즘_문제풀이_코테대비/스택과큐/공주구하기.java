package inflearn.자바_알고리즘_문제풀이_코테대비.스택과큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {

  public int solution(int n, int k) {

    int answer = 0;
    Queue<Integer> Q = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      Q.offer(i);
    }
    while (!Q.isEmpty()) {
      for (int i = 1; i < k; i++) {
        Q.offer(Q.poll());
      }
      Q.poll();
      if (Q.size() == 1) {
        answer = Q.poll();
      }
    }

    return answer;

  }


  public static void main(String[] args) {

    공주구하기 T = new 공주구하기();

    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int k = kb.nextInt();

    System.out.println(T.solution(n, k));

  }
}
