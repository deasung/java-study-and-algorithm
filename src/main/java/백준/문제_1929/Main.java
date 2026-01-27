package 백준.문제_1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 *
 * 출력
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 *
 * 예제 입력 1
 * 3 16
 *
 * 예제 출력 1
 * 3
 * 5
 * 7
 * 11
 * 13
 *
 * 소수(Prime Number)는 **'1과 자기 자신만으로 나누어떨어지는 1보다 큰 양의 정수'**를 의미합니다.
 * 소수의 수학적 정의는 **"1보다 큰 자연수 중에서, 1과 자기 자신만을 약수로 가지는 수"**입니다.
 */
public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    // isNotPrime[i]가 false이면 소수, true이면 소수가 아님
    boolean[] isNotPrime = new boolean[N + 1];

    // 0과 1은 소수가 아니므로 true로 초기화
    isNotPrime[0] = true;
    isNotPrime[1] = true;

    /*
     * 에라토스테네스의 체 알고리즘
     * - 아이디어: 소수가 아닌 수(합성수)는 반드시 자기 자신보다 작은 소수의 배수이다.
     * - 원리:
     *   1. 2부터 N까지의 모든 숫자가 담긴 리스트를 준비한다. (여기서는 boolean 배열로 구현)
     *   2. 2부터 시작해서, 2를 제외한 2의 배수들을 모두 지운다. (4, 6, 8, ...)
     *   3. 다음으로 남아있는 숫자인 3으로 가서, 3을 제외한 3의 배수들을 모두 지운다. (6, 9, 12, ...)
     *   4. 이 과정을 N의 제곱근까지 반복하면, 리스트에 남아있는 숫자들은 모두 소수가 된다.
     */

    // 2부터 N의 제곱근까지 반복
    for (int i = 2; i * i <= N; i++) {
      // i가 소수라면 (즉, 아직 다른 수의 배수로 지워지지 않았다면)
      if (!isNotPrime[i]) {
        // i의 배수들을 모두 소수가 아니라고 표시한다.
        // (j를 i*i 부터 시작하는 이유: i*2, i*3 등은 이미 2, 3과 같은 더 작은 소수들의 배수로서 이전에 처리되었기 때문)
        for (int j = i * i; j <= N; j += i) {
          isNotPrime[j] = true;
        }
      }
    }

    // M부터 N까지의 숫자 중 소수만 골라서 StringBuilder에 추가
    StringBuilder sb = new StringBuilder();
    for (int i = M; i <= N; i++) {
      if (!isNotPrime[i]) { // isNotPrime 배열에서 false인(지워지지 않은) 숫자가 소수이다.
        sb.append(i).append('\n');
      }
    }

    // 최종 결과 출력
    System.out.println(sb);
  }
}
