package 백준.문제_1005;

import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

    while (T-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken()); // 건물의 개수
      int K = Integer.parseInt(st.nextToken()); // 규칙의 개수

      int[] time = new int[N + 1]; // 각 건물 소요 시간
      st = new StringTokenizer(br.readLine());
      for (int i = 1; i <= N; i++) {
        time[i] = Integer.parseInt(st.nextToken());
      }

      List<Integer>[] adj = new ArrayList[N + 1]; // 연결 리스트 (그래프)
      for (int i = 1; i <= N; i++) adj[i] = new ArrayList<>();

      int[] indegree = new int[N + 1]; // 진입 차수 (먼저 지어야 할 건물 수)
      for (int i = 0; i < K; i++) {
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        adj[X].add(Y); // X를 지어야 Y를 지을 수 있음
        indegree[Y]++; // Y의 선행 건물 개수 증가
      }

      int W = Integer.parseInt(br.readLine()); // 목표 건물

      // 위상 정렬 및 결과 계산
      int[] result = new int[N + 1]; // 해당 건물을 짓기까지 걸리는 최대 시간
      Queue<Integer> q = new LinkedList<>();

      for (int i = 1; i <= N; i++) {
        result[i] = time[i]; // 초기값은 순수 자기 건설 시간
        if (indegree[i] == 0) q.offer(i); // 선행 건물이 없으면 큐에 삽입
      }

      while (!q.isEmpty()) {
        int curr = q.poll();

        for (int next : adj[curr]) {
          // 다음 건물의 최대 시작 시간 갱신 (가장 늦게 끝나는 선행 건물 기준)
          result[next] = Math.max(result[next], result[curr] + time[next]);
          indegree[next]--; // 선행 건물 하나 완료

          if (indegree[next] == 0) {
            q.offer(next);
          }
        }
      }
      System.out.println(result[W]); // 목표 건물의 누적 시간 출력
    }
  }
}
