package inflearn.자바_알고리즘_문제풀이_코테대비.투포인터;

/**
 * 연속된_자연수의_합
 * <p>
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요. 만약 N=15이면 7+8=15 4+5+6=15 1+2+3+4+5=15 와 같이 총 3가지의 경우가 존재한다.
 * <p>
 * ▣ 입력설명 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다. ▣ 출력설명 첫 줄에 총 경우수를 출력합니다. ▣ 입력예제 1 15 ▣ 출력예제 1 3
 */
public class 연속된_자연수의_합 {

  //강사가 푼 스타일
  public int solution(int n) {

    int answer = 0, sum = 0, lt = 0;
    int m = n / 2 + 1;
    int[] arr = new int[m];
    for (int i = 0; i < m; i++) {
      arr[i] = i + 1;
    }

    for (int rt = 0; rt < m; rt++) {

      sum += arr[rt];

      if (sum == n) {
        answer++;
      }

      while (sum >= n) {
        sum -= arr[lt++];

        if (sum == n) {
          answer++;
        }
      }

    }

    return answer;

  }

  public static void main(String[] args) {

    int n = 15;

    int sum = 0;
    int p1 = 0;
    int answer = 0;

    while (p1 < n) {

      if (sum < n) {

        sum += sum + 1;

      } else {

        if (p1 == n - 1) {
          break;
        }

        if (sum == n) {
          answer++;
          sum = ++p1 + 1;


        } else if (sum > n) {

          sum = ++p1 + 1;

          continue;
        }

      }

    }

    System.out.println(answer);

  }

}
